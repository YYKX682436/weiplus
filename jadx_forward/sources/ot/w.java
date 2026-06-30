package ot;

@j95.b
/* loaded from: classes9.dex */
public final class w extends jm0.o implements pt.l0 {

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f429873m;

    static {
        new ot.t(null);
        f429873m = jz5.h.b(ot.s.f429869d);
    }

    public void Zi(android.content.Context context, zt.k recordLoaderParams, android.widget.ImageView imageView, gk0.k bitmapOptions, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordLoaderParams, "recordLoaderParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapOptions, "bitmapOptions");
        java.lang.String aj6 = aj(recordLoaderParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgLoaderFeatureService", "attachRecordMsgItemThumb imageKey:" + aj6);
        g75.z zVar = new g75.z();
        zVar.l("Common_ImageKey", aj6);
        zVar.l("Common_TempFolder", new com.p314xaae8f345.mm.vfs.r6(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Vi(), aj6 + "_thumb"));
        zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        zVar.l("Common_MakeSureUIThread", java.lang.Boolean.TRUE);
        zVar.l("Common_ImageViewRef", new d75.c(imageView));
        zVar.l("key_record_params", recordLoaderParams);
        zVar.l("Common_BitmapOptions", bitmapOptions);
        imageView.setTag(com.p314xaae8f345.mm.R.id.h9z, aj6);
        new gk0.j(kz5.c0.k(zt.b.class, zt.f.class, zt.a.class, zt.m.class, zt.j.class, zt.e.class)).a(zVar, new java.lang.ref.WeakReference(new ot.u(imageView, aVar)));
    }

    public java.lang.String aj(zt.k recordLoaderParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordLoaderParams, "recordLoaderParams");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("key_");
        sb6.append(recordLoaderParams.f557077a);
        sb6.append('_');
        s15.h hVar = recordLoaderParams.f557078b;
        sb6.append(hVar.m75945x2fec8307(hVar.f384955d + 3));
        sb6.append('_');
        sb6.append(recordLoaderParams.f557079c);
        return sb6.toString();
    }

    public java.lang.String bj(java.lang.String imageKey, zt.k recordLoaderParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordLoaderParams, "recordLoaderParams");
        oi3.e eVar = recordLoaderParams.f557080d;
        s15.h dataItem = recordLoaderParams.f557078b;
        if (eVar != null) {
            if (!(eVar.m75942xfb822ef2(eVar.f427150d + 0) > 0)) {
                eVar = null;
            }
            if (eVar != null) {
                int i17 = mc0.k.R0;
                int i18 = eVar.f427150d;
                long m75942xfb822ef2 = eVar.m75942xfb822ef2(i18 + 0);
                long m75942xfb822ef22 = eVar.m75942xfb822ef2(i18 + 1);
                java.lang.String msgTalker = eVar.m75945x2fec8307(i18 + 3);
                int i19 = recordLoaderParams.f557079c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
                ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                java.lang.String G = bt3.g2.G(dataItem.m75945x2fec8307(dataItem.f384955d + 3), msgTalker, m75942xfb822ef2, m75942xfb822ef22, i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G, "getThumbPath(...)");
                return G;
            }
        }
        java.lang.String g17 = vu.a.g(dataItem);
        java.lang.String str = (g17 == null || r26.n0.N(g17)) ^ true ? g17 : null;
        if (str != null) {
            return str;
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Vi(), imageKey.concat("_thumb")).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }
}
