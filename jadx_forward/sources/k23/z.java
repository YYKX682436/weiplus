package k23;

/* loaded from: classes12.dex */
public final class z {
    public z(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, k23.v2 v2Var, int i17, int i18, k23.w0 voiceScene, java.lang.String title, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceScene, "voiceScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219738g = v2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219740i = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219741m = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219742n = voiceScene;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219743o = title;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219744p = k23.u2.f385235e;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219744p = k23.u2.f385234d;
        }
        try {
            p012xc85e97e9.p093xedfae76a.o a17 = bm5.a1.a(context);
            final k23.y yVar = new k23.y(this);
            a17.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.util.LifecycleExtKt$onDestroy$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m82216xac79a11b() {
                    yz5.a.this.mo152xb9724478();
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTSFloatingVoiceHalfScreenActivity", e17, "", new java.lang.Object[0]);
        }
        bh5.c cVar = new bh5.c();
        cVar.d(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.class));
        cVar.f102455a.f102457a = context;
        cVar.a(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.class.getName());
        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.C15619xf9c22e9e.class);
        cVar.e(true);
        cVar.c(true);
        cVar.g();
    }
}
