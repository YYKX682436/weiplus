package lf5;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f400061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.text.SpannableString spannableString) {
        super(2);
        this.f400061d = spannableString;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.text.style.ImageSpan[] imageSpanArr = (android.text.style.ImageSpan[]) this.f400061d.getSpans(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), android.text.style.ImageSpan.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageSpanArr);
        return java.lang.Boolean.valueOf(!(imageSpanArr.length == 0));
    }
}
