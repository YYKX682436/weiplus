package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public class SendAppMessageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.share.u1();
    public java.lang.String A;
    public java.lang.String A1;
    public java.lang.String B1;
    public java.lang.String C1;
    public java.lang.String D;
    public java.lang.String D1;
    public java.lang.String E;
    public java.lang.String E1;
    public int F;
    public int F1;
    public java.lang.String G1;
    public java.lang.String H;
    public int H1;
    public java.lang.String I;
    public java.util.ArrayList I1;

    /* renamed from: J, reason: collision with root package name */
    public int f83061J;
    public java.lang.Runnable J1;
    public int K1;
    public java.lang.String L;
    public int L1;
    public java.lang.String M;
    public boolean M1;
    public java.lang.String N;
    public java.lang.String N1;
    public boolean O1;
    public java.lang.String P;
    public boolean Q;
    public int Q1;
    public boolean R;
    public int R1;
    public boolean S;
    public java.lang.String S1;
    public boolean T;
    public java.lang.String T1;
    public boolean U;
    public java.lang.String U1;
    public java.lang.String V;
    public int V1;
    public java.lang.String W;
    public int W1;
    public java.lang.String X;
    public java.util.ArrayList X1;
    public int Y;
    public int Z;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83062f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f83063g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83064h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f83065i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f83066l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f83067m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f83068n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f83069o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f83070p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f83071p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f83072p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f83073q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f83074r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f83075s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f83076t;

    /* renamed from: u, reason: collision with root package name */
    public int f83077u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f83078v;

    /* renamed from: w, reason: collision with root package name */
    public int f83079w;

    /* renamed from: x, reason: collision with root package name */
    public int f83080x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f83081x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f83082x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f83083y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f83084y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f83085y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f83086z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f83087z1;
    public int B = 1;
    public int C = 2;
    public int G = 0;
    public int K = 1000;
    public boolean P1 = false;

    public SendAppMessageTask() {
    }

    public static void B(com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, ot0.q qVar, java.lang.String str, java.lang.String str2) {
        sendAppMessageTask.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageTask", "checkAddSignature thumbDataHash:%s, platformSignature:%s", str, str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        ot0.l lVar = new ot0.l();
        lVar.f348569d = str2;
        lVar.f348567b = str;
        qVar.f(lVar);
    }

    public final void C(ot0.q qVar, byte[] bArr, java.lang.String str, java.lang.StringBuilder sb6, int i17) {
        int i18;
        ot0.k1 a17 = ot0.j1.a();
        java.lang.String str2 = this.f83062f;
        java.lang.String str3 = this.f83064h;
        ((ez.w0) a17).getClass();
        android.util.Pair I = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, str2, str3, str, null, bArr);
        if (I.second != null) {
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            long longValue = ((java.lang.Long) I.second).longValue();
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = longValue;
            xzVar.f8410b = 0;
            xzVar.f8411c = str;
            updateForwardMsgIdEvent.e();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f83067m)) {
            ct.p2 p2Var = (ct.p2) i95.n0.c(ct.p2.class);
            java.lang.String str4 = this.f83067m;
            ((qg5.a) p2Var).getClass();
            java.util.HashMap a18 = com.tencent.mm.ui.i1.a(str4);
            if (!com.tencent.mm.storage.z3.R4(str) || a18 == null) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = str;
                mtVar.f7363b = this.f83067m;
                mtVar.f7364c = c01.e2.C(str);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            } else if (w11.t1.a(str)) {
                w11.r1 a19 = w11.s1.a(str);
                a19.e(this.f83067m);
                a19.h(c01.e2.C(str));
                a19.f442131f = 1;
                a19.f442133h = a18;
                a19.b();
            } else {
                w11.r1 a27 = w11.s1.a(str);
                a27.g(str);
                a27.e(this.f83067m);
                a27.h(c01.e2.C(str));
                a27.f442131f = 1;
                a27.f442133h = a18;
                a27.f442134i = 5;
                a27.a().a();
            }
        }
        if (str.toLowerCase().endsWith("@chatroom")) {
            java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
            i18 = L0 != null ? ((java.util.LinkedList) L0).size() : 0;
        } else {
            i18 = 1;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.n2.d(this.f83062f, i17, this.L, this.M, str, this.f83064h, this.f83076t, this.N, this.P, i18, sb6.toString(), this.X, this.Y, this.f83070p, this.Z, com.tencent.mm.storage.z3.R4(str) ? 2 : 1, this.f83086z);
    }

    public final void D(ot0.q qVar, byte[] bArr, java.lang.StringBuilder sb6, int i17, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, r45.wc7 wc7Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1118;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
        r45.gc7 gc7Var = new r45.gc7();
        gc7Var.f375099d = this.f83062f;
        java.util.LinkedList linkedList = new java.util.LinkedList(com.tencent.mm.sdk.platformtools.t8.P1(this.f83068n.split(",")));
        gc7Var.f375100e = linkedList;
        gc7Var.f375102g = str;
        if (j91.c.a(this.S1)) {
            gc7Var.f375101f = false;
        } else {
            gc7Var.f375101f = z17;
        }
        gc7Var.f375103h = this.O1;
        gc7Var.f375104i = this.N1;
        gc7Var.f375105m = z18;
        gc7Var.f375106n = z18 ? 3 : 0;
        gc7Var.f375107o = wc7Var;
        boolean a17 = j91.c.a(this.S1);
        gc7Var.f375108p = a17;
        if (a17) {
            r45.bz bzVar = new r45.bz();
            if (k01.d.a(this.f83068n) <= 2) {
                bzVar.f371159d = 2;
            } else {
                bzVar.f371159d = 1;
            }
            bzVar.f371160e = this.V1;
            bzVar.f371161f = new java.util.LinkedList();
            bzVar.f371165m = this.W1;
            java.util.Iterator it = this.X1.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                java.util.LinkedList linkedList2 = bzVar.f371166n;
                r45.nt5 nt5Var = new r45.nt5();
                nt5Var.f381664d = str3;
                linkedList2.add(nt5Var);
            }
            try {
                cl0.e eVar = new cl0.e(this.U1);
                for (int i18 = 0; i18 < eVar.length(); i18++) {
                    java.lang.String string = eVar.getString(i18);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        r45.hk4 hk4Var = new r45.hk4();
                        hk4Var.f376246e = string;
                        bzVar.f371161f.add(hk4Var);
                    }
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SendAppMessageTask", "parse participant json:%s fail", this.U1);
            }
            bzVar.f371162g = this.f83064h;
            bzVar.f371163h = this.f83063g;
            bzVar.f371164i = this.f83076t;
            gc7Var.f375109q = bzVar;
        }
        lVar.f70664a = gc7Var;
        lVar.f70665b = new r45.hc7();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.share.t1(this, linkedList, qVar, i17, str2, bArr, sb6), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83062f = parcel.readString();
        this.f83063g = parcel.readString();
        this.f83064h = parcel.readString();
        this.f83065i = parcel.readString();
        this.f83067m = parcel.readString();
        this.f83068n = parcel.readString();
        this.f83069o = parcel.readString();
        this.f83076t = parcel.readString();
        this.f83080x = parcel.readInt();
        this.f83070p = parcel.readString();
        this.f83073q = parcel.readString();
        this.f83074r = parcel.readString();
        this.f83075s = parcel.readInt() == 1;
        this.f83077u = parcel.readInt();
        this.f83078v = parcel.readString();
        this.f83079w = parcel.readInt();
        this.f83083y = parcel.readString();
        this.f83061J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readByte() == 1;
        this.R = parcel.readInt() == 1;
        this.S = parcel.readInt() == 1;
        this.V = parcel.readString();
        this.T = parcel.readInt() == 1;
        this.W = parcel.readString();
        this.Y = parcel.readInt();
        this.X = parcel.readString();
        this.I1 = parcel.readArrayList(com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask.class.getClassLoader());
        this.f83086z = parcel.readString();
        this.Z = parcel.readInt();
        this.C = parcel.readInt();
        this.A = parcel.readString();
        this.F = parcel.readInt();
        this.B = parcel.readInt();
        this.f83071p0 = parcel.readString();
        this.f83081x0 = parcel.readString();
        this.f83084y0 = parcel.readString();
        this.f83066l1 = parcel.readString();
        this.U = parcel.readInt() == 1;
        this.f83072p1 = parcel.readString();
        this.f83082x1 = parcel.readString();
        this.f83085y1 = parcel.readString();
        this.f83087z1 = parcel.readString();
        this.A1 = parcel.readString();
        this.B1 = parcel.readString();
        this.C1 = parcel.readString();
        this.D1 = parcel.readString();
        this.E1 = parcel.readString();
        this.F1 = parcel.readInt();
        this.G1 = parcel.readString();
        this.H1 = parcel.readInt();
        this.K1 = parcel.readInt();
        this.O1 = parcel.readInt() == 1;
        this.N1 = parcel.readString();
        this.P1 = parcel.readInt() == 1;
        this.G = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.Q1 = parcel.readInt();
        this.R1 = parcel.readInt();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.M1 = parcel.readInt() == 1;
        this.S1 = parcel.readString();
        this.U1 = parcel.readString();
        this.V1 = parcel.readInt();
        this.T1 = parcel.readString();
        this.X1 = parcel.readArrayList(com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask.class.getClassLoader());
        this.L1 = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f83062f);
        parcel.writeString(this.f83063g);
        parcel.writeString(this.f83064h);
        parcel.writeString(this.f83065i);
        parcel.writeString(this.f83067m);
        parcel.writeString(this.f83068n);
        parcel.writeString(this.f83069o);
        parcel.writeString(this.f83076t);
        parcel.writeInt(this.f83080x);
        parcel.writeString(this.f83070p);
        parcel.writeString(this.f83073q);
        parcel.writeString(this.f83074r);
        parcel.writeInt(this.f83075s ? 1 : 0);
        parcel.writeInt(this.f83077u);
        parcel.writeString(this.f83078v);
        parcel.writeInt(this.f83079w);
        parcel.writeString(this.f83083y);
        parcel.writeInt(this.f83061J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.P);
        parcel.writeByte(this.Q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.S ? 1 : 0);
        parcel.writeString(this.V);
        parcel.writeInt(this.T ? 1 : 0);
        parcel.writeString(this.W);
        parcel.writeInt(this.Y);
        parcel.writeString(this.X);
        parcel.writeList(this.I1);
        parcel.writeString(this.f83086z);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.C);
        parcel.writeString(this.A);
        parcel.writeInt(this.F);
        parcel.writeInt(this.B);
        parcel.writeString(this.f83071p0);
        parcel.writeString(this.f83081x0);
        parcel.writeString(this.f83084y0);
        parcel.writeString(this.f83066l1);
        parcel.writeInt(this.U ? 1 : 0);
        parcel.writeString(this.f83072p1);
        parcel.writeString(this.f83082x1);
        parcel.writeString(this.f83085y1);
        parcel.writeString(this.f83087z1);
        parcel.writeString(this.A1);
        parcel.writeString(this.B1);
        parcel.writeString(this.C1);
        parcel.writeString(this.D1);
        parcel.writeString(this.E1);
        parcel.writeInt(this.F1);
        parcel.writeString(this.G1);
        parcel.writeInt(this.H1);
        parcel.writeInt(this.K1);
        parcel.writeInt(this.O1 ? 1 : 0);
        parcel.writeString(this.N1);
        parcel.writeInt(this.P1 ? 1 : 0);
        parcel.writeInt(this.G);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.Q1);
        parcel.writeInt(this.R1);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.M1 ? 1 : 0);
        parcel.writeString(this.S1);
        parcel.writeString(this.U1);
        parcel.writeInt(this.V1);
        parcel.writeString(this.T1);
        parcel.writeList(this.X1);
        parcel.writeInt(this.L1);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.J1;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.share.r) runnable).run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e6 A[LOOP:0: B:61:0x03e0->B:63:0x03e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask.z():void");
    }

    public SendAppMessageTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
