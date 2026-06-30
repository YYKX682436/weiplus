package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/sticker/StickerEditorContainer;", "Landroid/widget/FrameLayout;", "Lqc0/g1;", "Ldl/f0;", "getCurrentArtist", "Lum/t;", "getCurrentItemCache", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aw3/a", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer */
/* loaded from: classes10.dex */
public final class C17090xc5b6aeb7 extends android.widget.FrameLayout implements qc0.g1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f237958h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f237959d;

    /* renamed from: e, reason: collision with root package name */
    public qk.o9 f237960e;

    /* renamed from: f, reason: collision with root package name */
    public ym5.y5 f237961f;

    /* renamed from: g, reason: collision with root package name */
    public qc0.p1 f237962g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17090xc5b6aeb7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237959d = "MicroMsg.StickerEditor.Container[" + hashCode() + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentArtist */
    public final dl.f0 m68376x2443866a() {
        l45.q m177317xc879b3f2;
        ym5.y5 y5Var = this.f237961f;
        if (y5Var == null || (m177317xc879b3f2 = y5Var.m177317xc879b3f2()) == null) {
            return null;
        }
        ym5.y5 y5Var2 = this.f237961f;
        return (dl.f0) ((l45.n) m177317xc879b3f2).d(y5Var2 != null ? y5Var2.m177360x1f85dc49() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentItemCache */
    public final um.t m68377x6a871a2c() {
        dl.f0 m68376x2443866a = m68376x2443866a();
        um.g gVar = m68376x2443866a != null ? (um.g) m68376x2443866a.d() : null;
        if (gVar instanceof um.t) {
            return (um.t) gVar;
        }
        return null;
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237959d, "exitSticker");
        qk.o9 o9Var = this.f237960e;
        if (o9Var != null) {
            o9Var.f();
        }
        ym5.y5 y5Var = this.f237961f;
        l45.q m177317xc879b3f2 = y5Var != null ? y5Var.m177317xc879b3f2() : null;
        if (m177317xc879b3f2 != null) {
            ((l45.n) m177317xc879b3f2).f398008p = null;
        }
        this.f237962g = null;
    }

    public final r45.ei0 e() {
        int i17;
        java.util.LinkedList linkedList;
        dl.f0 m68376x2443866a = m68376x2443866a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237959d, "genRestoreData: artist:" + m68376x2443866a);
        r45.ei0 ei0Var = new r45.ei0();
        um.g gVar = m68376x2443866a != null ? (um.g) m68376x2443866a.d() : null;
        um.t tVar = gVar instanceof um.t ? (um.t) gVar : null;
        if (m68376x2443866a == null || m68376x2443866a.d() == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generateEditorItemRestoreData: failed, artist:");
            sb6.append(m68376x2443866a);
            sb6.append(", cache:");
            sb6.append(m68376x2443866a != null ? (um.g) m68376x2443866a.d() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", sb6.toString());
        } else {
            java.util.LinkedList l17 = tVar != null ? tVar.l() : null;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            float f17 = 0.5f;
            if (l17 == null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("genTextItemRestoreData: failed, artist:");
                sb7.append(m68376x2443866a);
                sb7.append(", itemList size=");
                sb7.append(l17 != null ? java.lang.Integer.valueOf(l17.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", sb7.toString());
            } else {
                java.util.Iterator it = l17.iterator();
                while (it.hasNext()) {
                    xk0.o oVar = (xk0.o) it.next();
                    r45.ji0 ji0Var = new r45.ji0();
                    if (m68376x2443866a.f316574c.width() == 0 || m68376x2443866a.f316574c.height() == 0) {
                        ji0Var.f459355d = f17;
                        ji0Var.f459356e = f17;
                    } else {
                        ji0Var.f459355d = oVar.f536488m.x / m68376x2443866a.f316574c.width();
                        ji0Var.f459356e = oVar.f536488m.y / m68376x2443866a.f316574c.height();
                    }
                    ji0Var.f459357f = oVar.f536531J ? 2 : oVar.I != 0 ? 3 : 1;
                    int i18 = oVar.H;
                    java.lang.String format = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18 & 16777215)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    ji0Var.f459358g = format;
                    java.lang.String format2 = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(oVar.I & 16777215)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                    ji0Var.f459359h = format2;
                    ji0Var.f459360i = oVar.f536490o;
                    ji0Var.f459361m = oVar.f536489n;
                    ji0Var.f459362n = oVar.L.toString();
                    android.graphics.Bitmap bitmap = oVar.f536485g;
                    ji0Var.f459363o = bitmap != null ? bitmap.getWidth() : 0;
                    android.graphics.Bitmap bitmap2 = oVar.f536485g;
                    ji0Var.f459364p = bitmap2 != null ? bitmap2.getHeight() : 0;
                    linkedList2.add(ji0Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", "genTextItemRestoreData: mText=" + ((java.lang.Object) oVar.L) + ", scale=" + oVar.f536490o + ", mColor=" + i18 + ", mBgColor=" + oVar.I);
                    f17 = 0.5f;
                }
            }
            if (tVar != null) {
                linkedList = new java.util.LinkedList();
                java.util.Iterator it6 = tVar.e(true).iterator();
                while (it6.hasNext()) {
                    xk0.f fVar = (xk0.f) it6.next();
                    if (fVar instanceof xk0.n) {
                        linkedList.add(fVar);
                    }
                }
                i17 = 0;
                tVar.e(false).size();
                tVar.e(true).size();
                linkedList.size();
            } else {
                i17 = 0;
                linkedList = null;
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            if (linkedList == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("genPictureItemRestoreData: failed, artists:");
                sb8.append(m68376x2443866a);
                sb8.append(", itemList size=");
                sb8.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", sb8.toString());
            } else {
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    xk0.n nVar = (xk0.n) it7.next();
                    r45.gi0 gi0Var = new r45.gi0();
                    if (m68376x2443866a.f316574c.width() == 0 || m68376x2443866a.f316574c.height() == 0) {
                        gi0Var.f456801d = 0.5f;
                        gi0Var.f456802e = 0.5f;
                    } else {
                        gi0Var.f456801d = nVar.f536488m.x / m68376x2443866a.f316574c.width();
                        gi0Var.f456802e = nVar.f536488m.y / m68376x2443866a.f316574c.height();
                    }
                    gi0Var.f456803f = nVar.f536490o;
                    gi0Var.f456804g = nVar.f536489n;
                    gi0Var.f456805h = nVar.H;
                    java.lang.String str = nVar.I;
                    if (str == null) {
                        str = "";
                    }
                    gi0Var.f456806i = str;
                    android.graphics.Bitmap bitmap3 = nVar.f536485g;
                    gi0Var.f456807m = bitmap3 != null ? bitmap3.getWidth() : i17;
                    android.graphics.Bitmap bitmap4 = nVar.f536485g;
                    gi0Var.f456808n = bitmap4 != null ? bitmap4.getHeight() : i17;
                    linkedList3.add(gi0Var);
                }
            }
            ei0Var.f455062d = linkedList2;
            ei0Var.f455063e = linkedList3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", "generateEditorItemRestoreData: textItem size=" + ei0Var.f455062d.size() + ", picItem size=" + ei0Var.f455063e.size());
        }
        return ei0Var;
    }

    public void f(qc0.p1 p1Var) {
        l45.q m177317xc879b3f2;
        if (p1Var == null) {
            p1Var = this.f237962g;
        }
        java.lang.String str = this.f237959d;
        jz5.f0 f0Var = null;
        if (p1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "generateSticker start on [" + java.lang.Thread.currentThread().getName() + ']');
            ym5.y5 y5Var = this.f237961f;
            if (y5Var != null && (m177317xc879b3f2 = y5Var.m177317xc879b3f2()) != null) {
                ((l45.n) m177317xc879b3f2).c();
            }
            l(false);
            qk.o9 o9Var = this.f237960e;
            if (o9Var != null) {
                o9Var.g(new aw3.a(p1Var, e()), true);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "generateSticker: failed callback null");
        }
    }

    public final void g(int i17, r45.ei0 ei0Var) {
        boolean z17;
        dl.f0 m68376x2443866a = m68376x2443866a();
        um.t m68377x6a871a2c = m68377x6a871a2c();
        java.lang.String str = this.f237959d;
        if (m68376x2443866a == null || m68377x6a871a2c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "restore: artists or artistCache null");
            return;
        }
        aw3.i iVar = aw3.i.f96376a;
        if (ei0Var != null) {
            um.g gVar = (um.g) m68376x2443866a.d();
            if (gVar.e(false) == null) {
                ((um.g) m68376x2443866a.d()).R2(false);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar.e(false), "getStack(...)");
            if (!(!r6.isEmpty())) {
                java.util.LinkedList textItemRestoreDataList = ei0Var.f455062d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textItemRestoreDataList, "textItemRestoreDataList");
                java.util.LinkedList picItemRestoreDataList = ei0Var.f455063e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(picItemRestoreDataList, "picItemRestoreDataList");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", "restoreEditorItemWithSnapShot: textItemList size=" + textItemRestoreDataList.size() + ", picItemList size=" + picItemRestoreDataList.size());
                if (i17 == 1) {
                    iVar.a(picItemRestoreDataList, i17, m68376x2443866a);
                    iVar.b(textItemRestoreDataList, i17, m68376x2443866a);
                } else if (i17 == 2) {
                    iVar.b(textItemRestoreDataList, i17, m68376x2443866a);
                    iVar.a(picItemRestoreDataList, i17, m68376x2443866a);
                }
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "restore result=" + z17 + ", save alive " + m68377x6a871a2c.A3(true) + " last " + m68377x6a871a2c.A3(false));
                m68376x2443866a.r();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerEditor.InitWorker", "restore skip");
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "restore result=" + z17 + ", save alive " + m68377x6a871a2c.A3(true) + " last " + m68377x6a871a2c.A3(false));
        m68376x2443866a.r();
    }

    public r45.ei0 h(int i17, r45.ei0 restoreData, android.graphics.Bitmap bitmap) {
        xk0.o k17;
        xk0.o k18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreData, "restoreData");
        java.lang.String str = this.f237959d;
        if (bitmap != null) {
            java.util.LinkedList textItemRestoreDataList = restoreData.f455062d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textItemRestoreDataList, "textItemRestoreDataList");
            r45.ji0 ji0Var = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
            java.lang.String str2 = ji0Var != null ? ji0Var.f459362n : null;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            java.lang.String str3 = str2;
            yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/sticker/StickerEditorContainer", "replaceTextBitmap", "(ILcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;Landroid/graphics/Bitmap;)Lcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(bitmap, copy, "com/tencent/mm/plugin/recordvideo/ui/editor/sticker/StickerEditorContainer", "replaceTextBitmap", "(ILcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;Landroid/graphics/Bitmap;)Lcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            um.t m68377x6a871a2c = m68377x6a871a2c();
            xk0.o k19 = m68377x6a871a2c != null ? m68377x6a871a2c.k(true) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceTextBitmap stickerTextItem size:");
            um.t m68377x6a871a2c2 = m68377x6a871a2c();
            sb6.append(m68377x6a871a2c2 != null ? java.lang.Integer.valueOf(m68377x6a871a2c2.l().size()) : null);
            sb6.append(" aliveStickerItem:");
            sb6.append(k19);
            sb6.append(", targetType:");
            sb6.append(i17);
            sb6.append(", text:");
            sb6.append(str3);
            sb6.append("，textBitmap:");
            sb6.append(bitmap);
            sb6.append("(memory:");
            sb6.append(bitmap.getByteCount());
            sb6.append(",size:");
            sb6.append(bitmap.getWidth());
            sb6.append('*');
            sb6.append(bitmap.getHeight());
            sb6.append("),copyBitmap:");
            sb6.append(copy);
            sb6.append("(memory:");
            sb6.append(copy.getByteCount());
            sb6.append(",size:");
            sb6.append(copy.getWidth());
            sb6.append('*');
            sb6.append(copy.getHeight());
            sb6.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (k19 != null) {
                k19.H(copy, str3);
            } else {
                g(i17, restoreData);
                um.t m68377x6a871a2c3 = m68377x6a871a2c();
                if (m68377x6a871a2c3 != null && (k18 = m68377x6a871a2c3.k(false)) != null) {
                    k18.H(copy, str3);
                }
                um.t m68377x6a871a2c4 = m68377x6a871a2c();
                if (m68377x6a871a2c4 != null) {
                    m68377x6a871a2c4.f3(false);
                }
            }
        } else {
            um.t m68377x6a871a2c5 = m68377x6a871a2c();
            xk0.o k27 = m68377x6a871a2c5 != null ? m68377x6a871a2c5.k(true) : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("replaceTextBitmap stickerTextItem size:");
            um.t m68377x6a871a2c6 = m68377x6a871a2c();
            sb7.append(m68377x6a871a2c6 != null ? java.lang.Integer.valueOf(m68377x6a871a2c6.l().size()) : null);
            sb7.append(",clear!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            if (k27 != null) {
                k27.mo175635x5a5b64d();
            } else {
                g(i17, restoreData);
                um.t m68377x6a871a2c7 = m68377x6a871a2c();
                if (m68377x6a871a2c7 != null && (k17 = m68377x6a871a2c7.k(false)) != null) {
                    k17.mo175635x5a5b64d();
                }
                um.t m68377x6a871a2c8 = m68377x6a871a2c();
                if (m68377x6a871a2c8 != null) {
                    m68377x6a871a2c8.f3(false);
                }
            }
        }
        return e();
    }

    public r45.ei0 i(int i17, float f17, float f18) {
        xk0.f k17;
        um.t m68377x6a871a2c;
        if (i17 != 1) {
            if (i17 == 2 && (m68377x6a871a2c = m68377x6a871a2c()) != null) {
                k17 = m68377x6a871a2c.j(true);
            }
            k17 = null;
        } else {
            um.t m68377x6a871a2c2 = m68377x6a871a2c();
            if (m68377x6a871a2c2 != null) {
                k17 = m68377x6a871a2c2.k(true);
            }
            k17 = null;
        }
        if (k17 == null) {
            return null;
        }
        k17.v(f17, f18);
        return e();
    }

    public void j(boolean z17, float f17) {
        xk0.o k17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237959d, "showTextInput customInputViewTextSize:" + f17);
        ym5.y5 y5Var = this.f237961f;
        if (y5Var != null) {
            if (f17 > 0.0f) {
                y5Var.f545115y = f17;
                com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x96919289 = y5Var.f544890t;
                com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa94 = c22795x96919289 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 ? (com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94) c22795x96919289 : null;
                if (c22810x4e74aa94 != null) {
                    c22810x4e74aa94.setTextSize(f17);
                }
            }
            um.t m68377x6a871a2c = m68377x6a871a2c();
            if (m68377x6a871a2c == null || (k17 = m68377x6a871a2c.k(true)) == null) {
                return;
            }
            java.util.Objects.toString(k17.L);
            float f18 = k17.f536488m.x;
            dl.f0 m68376x2443866a = m68376x2443866a();
            if (m68376x2443866a != null) {
                m68376x2443866a.J(k17);
            }
        }
    }

    public final void k(r45.ee6 configData, qc0.p1 callback) {
        l45.q m177317xc879b3f2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configData, "configData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = this.f237959d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startInit: ");
        r45.ii0 ii0Var = configData.f454904g;
        android.graphics.Rect rect = new android.graphics.Rect(ii0Var.f458592d, ii0Var.f458593e, ii0Var.f458594f, ii0Var.f458595g);
        r45.fi0 fi0Var = configData.f454903f;
        android.graphics.Rect rect2 = new android.graphics.Rect(fi0Var.f455907d, fi0Var.f455908e, fi0Var.f455909f, fi0Var.f455910g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initEditor safeRect=" + rect + ", outputRect=" + rect2);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f237960e = lVar;
        qk.l9 l9Var = new qk.l9();
        l9Var.f445765b = false;
        l9Var.f445766c = false;
        l9Var.f445770g = false;
        l9Var.f445764a = qk.n9.LIVE_STICKER;
        l9Var.f445769f = rect2;
        l9Var.f445767d = str;
        lVar.d(l9Var);
        qk.o9 o9Var = this.f237960e;
        qk.s c17 = o9Var != null ? o9Var.c(getContext()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.StickerDrawingView");
        ym5.y5 y5Var = (ym5.y5) c17;
        this.f237961f = y5Var;
        r45.fi0 fi0Var2 = configData.f454903f;
        android.graphics.Rect rect3 = new android.graphics.Rect(fi0Var2.f455907d, fi0Var2.f455908e, fi0Var2.f455909f, fi0Var2.f455910g);
        float f17 = configData.f454902e;
        bn5.m mVar = (bn5.m) y5Var.m177310x5143ab24();
        if (mVar != null) {
            mVar.m10950xf096f6fd(rect3);
        }
        ((l45.n) y5Var.m177317xc879b3f2()).x(rect3.right - rect3.left, rect3.bottom - rect3.top);
        ((l45.n) y5Var.m177317xc879b3f2()).f398010r = new cm5.g(f17, f17, null, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initDrawingView: outputBitmapRect=" + rect3);
        int i17 = configData.f454908n;
        y5Var.m177361x332f72c6(i17 != 1 ? i17 != 2 ? ym5.n5.f544978d : ym5.n5.f544980f : ym5.n5.f544979e);
        r45.ci0 ci0Var = configData.f454906i;
        int i18 = ci0Var.f453098d;
        int i19 = ci0Var.f453099e;
        int i27 = ci0Var.f453100f;
        int i28 = ci0Var.f453101g;
        c01.r2 r2Var = new c01.r2(i18, i19, i27, i28);
        android.view.View view = y5Var.f544884n;
        if (view != null && y5Var.I != null) {
            y5Var.G = r2Var;
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.d8f);
            android.view.View findViewById2 = y5Var.f544884n.findViewById(com.p314xaae8f345.mm.R.id.auj);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin += i19;
                findViewById.setLayoutParams(layoutParams2);
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById2 != null ? findViewById2.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.bottomMargin += i28;
                findViewById2.setLayoutParams(layoutParams4);
            }
            android.view.View view2 = y5Var.I;
            android.view.ViewGroup.LayoutParams layoutParams5 = view2 != null ? view2.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.bottomMargin = i65.a.h(y5Var.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + i28;
                android.view.View view3 = y5Var.I;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams6);
                }
            }
        }
        y5Var.h(configData.f454906i.f453102h);
        float f18 = configData.f454906i.f453103i;
        if (f18 > 0.0f) {
            y5Var.f545115y = f18;
            com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x96919289 = y5Var.f544890t;
            com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa94 = c22795x96919289 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 ? (com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94) c22795x96919289 : null;
            if (c22810x4e74aa94 != null) {
                c22810x4e74aa94.setTextSize(f18);
            }
        }
        r45.ci0 ci0Var2 = configData.f454906i;
        int i29 = ci0Var2.f453104m;
        int i37 = ci0Var2.f453105n;
        com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x969192892 = y5Var.f544890t;
        com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa942 = c22795x969192892 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 ? (com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94) c22795x969192892 : null;
        if (c22810x4e74aa942 != null) {
            c22810x4e74aa942.d(i29);
            if (i37 > 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("\u3000", "")) {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(c22810x4e74aa942.getTextSize());
                c22810x4e74aa942.setMaxWidth((int) ((paint.measureText("\u3000") * i37) + c22810x4e74aa942.getPaddingLeft() + c22810x4e74aa942.getPaddingRight()));
            }
        }
        addView(y5Var);
        r45.ii0 safeRect = configData.f454904g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(safeRect, "safeRect");
        dl.f0 m68376x2443866a = m68376x2443866a();
        if (m68376x2443866a != null) {
            int i38 = safeRect.f458592d;
            int i39 = safeRect.f458593e;
            int i47 = safeRect.f458594f;
            int i48 = safeRect.f458595g;
            android.graphics.Matrix h17 = m68376x2443866a.h();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            h17.invert(matrix);
            android.graphics.RectF rectF = new android.graphics.RectF(i38, i39, i47, i48);
            matrix.mapRect(rectF);
            m68376x2443866a.f316575d = new android.graphics.Rect(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
        int i49 = configData.f454901d;
        r45.ei0 editorItemRestoreData = configData.f454905h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(editorItemRestoreData, "editorItemRestoreData");
        g(i49, editorItemRestoreData);
        this.f237962g = callback;
        ym5.y5 y5Var2 = this.f237961f;
        if (y5Var2 != null) {
            y5Var2.m177362x75dfad45(new aw3.c(this, callback, configData));
        }
        ym5.y5 y5Var3 = this.f237961f;
        if (y5Var3 != null) {
            y5Var3.m177363xbf82e4c7(new aw3.d(this, callback));
        }
        ym5.y5 y5Var4 = this.f237961f;
        if (y5Var4 != null && (m177317xc879b3f2 = y5Var4.m177317xc879b3f2()) != null) {
            ((l45.n) m177317xc879b3f2).f398008p = new aw3.e(this, callback);
        }
        int i57 = configData.f454901d;
        if (i57 != 1) {
            if (i57 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handlePictureItem: ");
            l(true);
            post(new aw3.b(this));
            return;
        }
        l(true);
        um.t m68377x6a871a2c = m68377x6a871a2c();
        xk0.o k17 = m68377x6a871a2c != null ? m68377x6a871a2c.k(false) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTextItem: lastTextItem exist=");
        sb6.append(k17 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ym5.y5 y5Var5 = this.f237961f;
        if (y5Var5 != null) {
            l45.n nVar = (l45.n) y5Var5.m177317xc879b3f2();
            nVar.getClass();
            new l45.a(nVar).a(y5Var5.m177360x1f85dc49());
            if (k17 == null) {
                ((l45.n) y5Var5.m177317xc879b3f2()).u();
                y5Var5.mo177319xb073c692().requestFocus();
                y5Var5.mo177319xb073c692().postDelayed(new ym5.x5(y5Var5), y5Var5.C);
            } else {
                ym5.y5.e(y5Var5, c01.s2.f118967g, false, 2, null);
                k17.w(true);
                ym5.y5 y5Var6 = this.f237961f;
                if (y5Var6 != null) {
                    y5Var6.j();
                }
            }
        }
    }

    public final void l(boolean z17) {
        int visibility = getVisibility();
        int i17 = z17 ? 0 : 8;
        setVisibility(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237959d, "updateSelfVisibility: from " + visibility + " to " + i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237959d, "onAttachedToWindow: ");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237959d, "onDetachedFromWindow: ");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17090xc5b6aeb7(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f237959d = "MicroMsg.StickerEditor.Container[" + hashCode() + ']';
    }
}
