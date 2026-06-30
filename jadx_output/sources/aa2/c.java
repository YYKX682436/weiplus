package aa2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f2497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aa2.j jVar) {
        super(1);
        this.f2497d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar != null ? fVar.f70615a : 0;
        int i18 = fVar != null ? fVar.f70616b : 0;
        r45.rh2 rh2Var = fVar != null ? (r45.rh2) fVar.f70618d : null;
        aa2.j jVar = this.f2497d;
        jVar.getClass();
        if (rh2Var instanceof r45.rh2) {
            androidx.appcompat.app.AppCompatActivity activity = jVar.f434158a;
            if (i17 == 0 && i18 == 0) {
                kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
                r45.e21 e21Var = jVar.f2505d;
                if (e21Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str = finderContact.getUsername()) == null) {
                    str = "";
                }
                lVar.remove(str);
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            } else if (i18 == -4059) {
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = (com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.class);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderActivityParticipateUIC.f101815i;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                android.widget.TextView textView = finderActivityParticipateUIC.f101816m;
                if (textView != null) {
                    textView.setText(finderActivityParticipateUIC.V6());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
