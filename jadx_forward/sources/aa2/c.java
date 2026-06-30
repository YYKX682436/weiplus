package aa2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f84030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aa2.j jVar) {
        super(1);
        this.f84030d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar != null ? fVar.f152148a : 0;
        int i18 = fVar != null ? fVar.f152149b : 0;
        r45.rh2 rh2Var = fVar != null ? (r45.rh2) fVar.f152151d : null;
        aa2.j jVar = this.f84030d;
        jVar.getClass();
        if (rh2Var instanceof r45.rh2) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = jVar.f515691a;
            if (i17 == 0 && i18 == 0) {
                kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
                r45.e21 e21Var = jVar.f84038d;
                if (e21Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1)) == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                    str = "";
                }
                lVar.m77803xc84af884(str);
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            } else if (i18 == -4059) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466.class);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c13667xc5da9466.f183348i;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(8);
                }
                android.widget.TextView textView = c13667xc5da9466.f183349m;
                if (textView != null) {
                    textView.setText(c13667xc5da9466.V6());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
