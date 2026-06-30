package d55;

/* loaded from: classes12.dex */
public class q extends d55.o {
    public q(java.lang.String str, int i17) {
        super(str, java.lang.Integer.valueOf(i17));
    }

    @Override // d55.o
    public void a(android.content.SharedPreferences.Editor editor) {
        editor.putInt(this.f308133a, ((java.lang.Integer) this.f308134b).intValue());
    }

    @Override // d55.n
    /* renamed from: getDescription */
    public java.lang.String mo123521x730bcac6() {
        return "putInt(" + this.f308133a + ", " + this.f308134b + ")";
    }
}
