package mz4;

/* loaded from: classes12.dex */
public class t implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f414883d;

    /* renamed from: e, reason: collision with root package name */
    public int f414884e;

    public t(int i17, int i18) {
        this.f414883d = i17;
        this.f414884e = i18;
        if (i17 > i18) {
            this.f414884e = i17;
            this.f414883d = i18;
        }
    }

    public boolean a() {
        return this.f414883d == this.f414884e;
    }

    public mz4.t b(int i17, int i18) {
        this.f414883d = java.lang.Math.max(0, this.f414883d - i17);
        this.f414884e += i18;
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m148697x9616526c() {
        return "[" + this.f414883d + ", " + this.f414884e + "]";
    }

    public t(android.widget.EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
