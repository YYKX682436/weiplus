package p16;

/* loaded from: classes16.dex */
public class z extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public p16.h0 f432904d;

    public z(java.lang.String str) {
        super(str);
        this.f432904d = null;
    }

    public static p16.z b() {
        return new p16.z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public p16.z a(p16.h0 h0Var) {
        this.f432904d = h0Var;
        return this;
    }
}
