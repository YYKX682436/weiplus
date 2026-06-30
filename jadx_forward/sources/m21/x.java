package m21;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f404547a = new java.lang.StringBuffer();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuffer f404548b = new java.lang.StringBuffer();

    /* renamed from: c, reason: collision with root package name */
    public int f404549c = 0;

    public void a(java.lang.String str, java.lang.Object obj) {
        this.f404547a.append(str + "->" + obj + "\n");
        this.f404548b.append(obj);
    }

    public void b(java.lang.String str, java.lang.Object obj) {
        this.f404547a.append(this.f404549c + " " + str + "->" + obj + "\n");
        this.f404548b.append(obj);
        this.f404549c = this.f404549c + 1;
    }

    public java.lang.String c() {
        this.f404549c = 0;
        java.lang.StringBuffer stringBuffer = this.f404547a;
        stringBuffer.append("--end--\n\n");
        return stringBuffer.toString();
    }

    /* renamed from: toString */
    public java.lang.String m146697x9616526c() {
        return this.f404548b.toString();
    }
}
