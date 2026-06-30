package pk2;

/* loaded from: classes3.dex */
public final class v extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437829i = n() ? "anchorlive.more.commentmanage.assistant" : "startlive.more.commentmanage.assistant";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437829i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 moreCommentSettingBottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreCommentSettingBottomSheet, "moreCommentSettingBottomSheet");
        android.view.View findViewById = moreCommentSettingBottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.f567034hw4);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.u(o9Var, moreCommentSettingBottomSheet, this));
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.c7l);
    }
}
