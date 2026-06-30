package zs5;

/* loaded from: classes15.dex */
public class z implements kd0.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f557059a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b f557060b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f557061c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f557062d;

    @Override // kd0.d3
    public int a(int[] iArr) {
        return 0;
    }

    @Override // kd0.d3
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "setEnableMultiCode enable: %s", java.lang.Boolean.valueOf(z17));
        this.f557062d = z17;
    }

    @Override // kd0.d3
    public void c(android.content.Context context, int i17, ry3.s sVar) {
        boolean z17;
        if (sVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f557059a) {
                if (this.f557060b == null) {
                    et5.a.a(null);
                    java.lang.Boolean bool = et5.a.f338203a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "createAffQBar QBarSoLoaded: %s", bool);
                    if (bool == null || !bool.booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "createAffQBar load so failed");
                        z17 = false;
                    } else {
                        this.f557060b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d.f298516b.a();
                        z17 = true;
                    }
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "initAffQBar create failed");
                        return;
                    }
                }
                int c17 = this.f557060b.c(et5.f.a(sVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "initAffQBar ret: %d, cost: %d", java.lang.Integer.valueOf(c17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                if (c17 == 0) {
                    this.f557061c = true;
                } else {
                    this.f557061c = false;
                }
            }
        }
    }

    @Override // kd0.d3
    public boolean d() {
        return this.f557061c;
    }

    @Override // kd0.d3
    public zs5.b0 e(int[] iArr, android.graphics.Point point, android.graphics.PointF pointF, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (this.f557060b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "decodeFile qbar null");
            return null;
        }
        e04.f2 f2Var = e04.f2.f327458a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || z65.c.a()) && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2566x35c67d.C20656xc5d46e03()) == 1 && java.lang.Math.floor(java.lang.Math.random() * 3.0d) % 3.0d == 1.0d) {
            throw new java.lang.RuntimeException("decodeFile test exception");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] decodeFile imageSize: %s", point);
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] prepareGrayData , data is null");
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(point.x * point.y);
        int f17 = this.f557060b.f(iArr, point.x, point.y, allocateDirect);
        if (f17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] transBytes result: %d", java.lang.Integer.valueOf(f17));
            return null;
        }
        byte[] f18 = et5.h.f(allocateDirect);
        if (f18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] data null");
            return null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s e17 = this.f557060b.e(f18, point.x, point.y, pointF != null ? pointF.x : -1.0f, pointF != null ? pointF.y : -1.0f);
        zs5.b0 b0Var = new zs5.b0();
        java.lang.String str2 = e17.f298663f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        b0Var.f556858b = str2;
        if (!e17.f298661d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] scanImage result failed");
            return b0Var;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (e17.f298662e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] decode_result null");
            return b0Var;
        }
        i(e17, arrayList3, arrayList, arrayList2, this.f557062d);
        b0Var.f556857a = arrayList3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file-result] decodeGrayData get %d results, cost %s ms", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return b0Var;
    }

    public byte[] f(byte[] bArr, android.graphics.Point point, int i17, android.graphics.Rect rect, int[] iArr, int[] iArr2) {
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffWxQBarAIDecoder", "prepareGrayData , data is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "cropGrayData, size %s, rect %s, rotation %d", point, rect, java.lang.Integer.valueOf(i17));
        int width = rect != null ? rect.width() : point.x;
        int height = rect != null ? rect.height() : point.y;
        int i18 = rect != null ? rect.left : 0;
        int i19 = rect != null ? rect.top : 0;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(((width * height) * 3) / 2);
        synchronized (this.f557059a) {
            try {
                try {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b bVar = this.f557060b;
                    if (bVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "cropGrayData qbar null");
                        return null;
                    }
                    bVar.a(bArr, point.x, point.y, i18, i19, width, height, i17, 0, allocateDirect);
                    int[] iArr3 = iArr == null ? new int[2] : iArr;
                    iArr3[0] = width;
                    iArr3[1] = height;
                    if (i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 == 90 || i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 == 270) {
                        iArr3[0] = height;
                        iArr3[1] = width;
                    }
                    byte[] f17 = et5.h.f(allocateDirect);
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = java.lang.Integer.valueOf(iArr3[0]);
                    objArr[1] = java.lang.Integer.valueOf(iArr3[1]);
                    objArr[2] = java.lang.Boolean.valueOf(f17 == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "cropGrayData.result outSize: %s, %s, grayData == null: %s", objArr);
                    return f17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public java.util.List g(int[] iArr, android.graphics.Point point) {
        zs5.b0 e17 = e(iArr, point, null, null, null);
        java.util.List list = e17 != null ? e17.f556857a : null;
        if (list != null) {
            return new java.util.ArrayList(list);
        }
        return null;
    }

    public java.util.List h(byte[] bArr, int i17, int i18, boolean z17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        synchronized (this.f557059a) {
            if (this.f557060b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "decodeGrayData qbar null");
                return null;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s e17 = this.f557060b.e(bArr, i17, i18, -1.0f, -1.0f);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (!e17.f298661d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] scanImage result failed");
                return null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (e17.f298662e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] decode_result null");
                return null;
            }
            i(e17, arrayList3, arrayList, arrayList2, this.f557062d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] decodeGrayData get %d results, cost %s ms, scanImage.cost: %d", java.lang.Integer.valueOf(e17.f298662e.f298548e.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
            return arrayList3;
        }
    }

    public final void i(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s sVar, java.util.List list, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z17) {
        com.p314xaae8f345.p2891x34da02.C25303x87b156a3 a17;
        java.util.Iterator it = sVar.f298662e.f298548e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 item = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            byte[] c17 = et5.g.c(item);
            java.lang.String a18 = et5.g.a(item);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXQBarResultUtils", "transformWXQBarResult charset: " + item.f298590g + ", content: " + a18);
            com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80 = new com.p314xaae8f345.p2891x34da02.C25311x69ff7e80(item.f298588e, item.f298589f, a18, c17, item.f298590g, item.f298591h);
            c25311x69ff7e80.f296783m = item.f298593m;
            c25311x69ff7e80.f296784n = item.f298595o;
            c25311x69ff7e80.f296786p = true;
            zs5.a aVar = zs5.y.A;
            com.p314xaae8f345.p2891x34da02.C25303x87b156a3 a19 = aVar.a(item);
            if (a19 != null) {
                c25311x69ff7e80.f296785o = new com.p314xaae8f345.p2891x34da02.C25310xa03ac6cd(a19);
            }
            list.add(c25311x69ff7e80);
            if (arrayList != null && (a17 = aVar.a(item)) != null) {
                arrayList.add(a17);
            }
            if (!z17) {
                break;
            }
        }
        if (arrayList2 != null) {
            java.util.Iterator it6 = sVar.f298662e.f298550g.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g1 wxQBarReportMsg = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g1) it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxQBarReportMsg, "wxQBarReportMsg");
                com.p314xaae8f345.p2891x34da02.C25312x3165f541 c25312x3165f541 = new com.p314xaae8f345.p2891x34da02.C25312x3165f541();
                c25312x3165f541.f45430x93fa756a = wxQBarReportMsg.f298551d;
                c25312x3165f541.f45411xb8c8890f = wxQBarReportMsg.f298552e;
                c25312x3165f541.f45420x8c07e410 = wxQBarReportMsg.f298553f;
                c25312x3165f541.f45432xeee445d5 = wxQBarReportMsg.f298554g;
                c25312x3165f541.f45431xecb7bf07 = wxQBarReportMsg.f298555h;
                c25312x3165f541.f45435xcaab8dcc = wxQBarReportMsg.f298556i;
                c25312x3165f541.f45424x5e75e99 = wxQBarReportMsg.f298557m;
                c25312x3165f541.f45416xb7f3b1db = wxQBarReportMsg.f298558n;
                c25312x3165f541.f45426x1e2bc0c2 = wxQBarReportMsg.f298559o;
                c25312x3165f541.f45425xd033a998 = wxQBarReportMsg.f298560p;
                c25312x3165f541.f45422xd5533528 = wxQBarReportMsg.f298561q;
                c25312x3165f541.f45427xff69accb = wxQBarReportMsg.f298562r;
                c25312x3165f541.f45412xef74d700 = wxQBarReportMsg.f298563s;
                c25312x3165f541.f45428x78daff26 = wxQBarReportMsg.f298564t;
                c25312x3165f541.f45408xf319439f = wxQBarReportMsg.f298565u;
                c25312x3165f541.f45434x7591adc2 = wxQBarReportMsg.f298566v;
                c25312x3165f541.f45423xb704735b = wxQBarReportMsg.f298567w;
                c25312x3165f541.f45409x3bc420d9 = wxQBarReportMsg.f298568x;
                c25312x3165f541.f45413x1eb500d3 = wxQBarReportMsg.f298569y;
                c25312x3165f541.f45415x5de5b10c = wxQBarReportMsg.f298570z;
                c25312x3165f541.f45418x44762225 = wxQBarReportMsg.A;
                c25312x3165f541.f45419x492be0d8 = wxQBarReportMsg.B;
                c25312x3165f541.f45417xa7d8ff9e = wxQBarReportMsg.C;
                arrayList2.add(c25312x3165f541);
                if (!z17) {
                    return;
                }
            }
        }
    }

    public com.p314xaae8f345.p2891x34da02.C25306xcef9dd2e j() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1 b17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b bVar;
        synchronized (this.f557059a) {
            b17 = (!this.f557061c || (bVar = this.f557060b) == null) ? null : bVar.b();
        }
        if (b17 == null) {
            return null;
        }
        com.p314xaae8f345.p2891x34da02.C25306xcef9dd2e c25306xcef9dd2e = new com.p314xaae8f345.p2891x34da02.C25306xcef9dd2e();
        c25306xcef9dd2e.f45392xb9ac001d = b17.f298536e;
        c25306xcef9dd2e.f45393xc24e9f02 = b17.f298535d;
        return c25306xcef9dd2e;
    }

    @Override // kd0.d3
    /* renamed from: release */
    public void mo142436x41012807() {
        synchronized (this.f557059a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffWxQBarAIDecoder", "releaseAffQBar, inited: %s, hashCode: %s", java.lang.Boolean.valueOf(this.f557061c), java.lang.Integer.valueOf(hashCode()));
            if (this.f557061c) {
                this.f557061c = false;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b bVar = this.f557060b;
                if (bVar != null) {
                    bVar.d();
                }
            }
        }
    }
}
