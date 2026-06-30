package nx1;

/* loaded from: classes12.dex */
public class p implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f422848d;

    /* renamed from: e, reason: collision with root package name */
    public int f422849e;

    public p(int i17, int i18) {
        this.f422848d = i17;
        this.f422849e = i18;
        if (i17 > i18) {
            this.f422849e = i17;
            this.f422848d = i18;
        }
    }

    public boolean a() {
        return this.f422848d == this.f422849e;
    }

    /* renamed from: toString */
    public java.lang.String m150283x9616526c() {
        return "[" + this.f422848d + ", " + this.f422849e + "]";
    }

    public p(android.widget.EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
