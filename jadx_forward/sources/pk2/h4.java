package pk2;

/* loaded from: classes3.dex */
public final class h4 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437346i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437346i = n() ? "anchorlive.more.commentmanage.sensitivity" : "startlive.more.commentmanage.sensitivity";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437346i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 moreCommentSettingBottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreCommentSettingBottomSheet, "moreCommentSettingBottomSheet");
        android.view.View findViewById = moreCommentSettingBottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.f567046hy1);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.g4(o9Var, moreCommentSettingBottomSheet, this));
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.y4 y4Var = ml2.j0.f409116i;
        ((ml2.j0) c17).Nj("live_sensitive_word_button", "view_exp", null);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.mmr);
    }
}
