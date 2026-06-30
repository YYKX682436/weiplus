package qh;

/* loaded from: classes12.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f444920a = new java.lang.StringBuilder();

    public qh.u a(java.lang.Object obj) {
        this.f444920a.append(obj);
        return this;
    }

    public qh.u b(java.lang.String str) {
        java.lang.StringBuilder sb6 = this.f444920a;
        sb6.append("+ ");
        sb6.append(r26.i0.s("-", 89));
        sb6.append("\n");
        sb6.append("| ");
        sb6.append(str);
        sb6.append(" :");
        sb6.append("\n");
        return this;
    }

    public qh.u c(java.lang.String str) {
        java.lang.StringBuilder sb6 = this.f444920a;
        sb6.append("| ");
        sb6.append("  <");
        sb6.append(str);
        sb6.append(">\n");
        return this;
    }

    public void d() {
        try {
            oj.j.c("Matrix.battery.BatteryPrinter", "%s", "\t\n" + this.f444920a.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.BatteryPrinter", th6, "log format error", new java.lang.Object[0]);
        }
    }

    public qh.u e() {
        this.f444920a.append("\t");
        return this;
    }

    public qh.u f() {
        this.f444920a.append(r26.i0.s("*", 91));
        return this;
    }

    public qh.u g(java.lang.String str) {
        java.lang.StringBuilder sb6 = this.f444920a;
        sb6.append("| ");
        sb6.append("  -> ");
        sb6.append(str);
        sb6.append("\n");
        return this;
    }

    public qh.u h(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = this.f444920a;
        sb6.append("| ");
        sb6.append("  -> ");
        sb6.append(str);
        sb6.append("\t= ");
        sb6.append(str2);
        sb6.append("\n");
        return this;
    }

    public qh.u i() {
        java.lang.String s17 = r26.i0.s("*", 40);
        java.lang.StringBuilder sb6 = this.f444920a;
        sb6.append(s17);
        sb6.append(" PowerTest ");
        sb6.append(r26.i0.s("*", 40));
        sb6.append("\n");
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m160116x9616526c() {
        return this.f444920a.toString();
    }
}
