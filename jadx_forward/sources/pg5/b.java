package pg5;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.Spannable f435783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f435784b;

    public b(android.text.Spannable spannable, int i17) {
        this.f435783a = spannable;
        this.f435784b = i17;
    }

    /* renamed from: equals */
    public boolean m158518xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg5.b)) {
            return false;
        }
        pg5.b bVar = (pg5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f435783a, bVar.f435783a) && this.f435784b == bVar.f435784b;
    }

    /* renamed from: hashCode */
    public int m158519x8cdac1b() {
        android.text.Spannable spannable = this.f435783a;
        return ((spannable == null ? 0 : spannable.hashCode()) * 31) + java.lang.Integer.hashCode(this.f435784b);
    }

    /* renamed from: toString */
    public java.lang.String m158520x9616526c() {
        return "EmojiProcessResult(resultSpannableString=" + ((java.lang.Object) this.f435783a) + ", allTypeEmojiCount=" + this.f435784b + ')';
    }
}
