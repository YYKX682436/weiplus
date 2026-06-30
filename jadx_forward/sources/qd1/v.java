package qd1;

/* loaded from: classes7.dex */
public class v extends android.text.Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f443212a;

    public v(qd1.w wVar, int i17) {
        this.f443212a = i17;
    }

    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        android.text.Spannable newSpannable = super.newSpannable(charSequence);
        if (!android.text.TextUtils.isEmpty(newSpannable)) {
            newSpannable.setSpan(new qd1.u(this, this.f443212a, 17), 0, newSpannable.length(), 18);
        }
        return newSpannable;
    }
}
