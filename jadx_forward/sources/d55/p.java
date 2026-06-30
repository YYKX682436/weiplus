package d55;

/* loaded from: classes12.dex */
public class p extends d55.o {
    public p(java.lang.String str, boolean z17) {
        super(str, java.lang.Boolean.valueOf(z17));
    }

    @Override // d55.o
    public void a(android.content.SharedPreferences.Editor editor) {
        editor.putBoolean(this.f308133a, ((java.lang.Boolean) this.f308134b).booleanValue());
    }

    @Override // d55.n
    /* renamed from: getDescription */
    public java.lang.String mo123521x730bcac6() {
        return "putBoolean(" + this.f308133a + ", " + this.f308134b + ")";
    }
}
