package d7;

/* loaded from: classes13.dex */
public class b0 implements t6.p {

    /* renamed from: b, reason: collision with root package name */
    public final t6.p f308320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f308321c;

    public b0(t6.p pVar, boolean z17) {
        this.f308320b = pVar;
        this.f308321c = z17;
    }

    @Override // t6.p
    public w6.z0 a(android.content.Context context, w6.z0 z0Var, int i17, int i18) {
        x6.d dVar = com.p147xb1cd08cc.p148x5de23a5.c.b(context).f125455d;
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) z0Var.get();
        w6.z0 a17 = d7.a0.a(dVar, drawable, i17, i18);
        if (a17 != null) {
            w6.z0 a18 = this.f308320b.a(context, a17, i17, i18);
            if (!a18.equals(a17)) {
                return new d7.g0(context.getResources(), a18);
            }
            a18.mo14474x408b7293();
            return z0Var;
        }
        if (!this.f308321c) {
            return z0Var;
        }
        throw new java.lang.IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        this.f308320b.b(messageDigest);
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof d7.b0) {
            return this.f308320b.equals(((d7.b0) obj).f308320b);
        }
        return false;
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return this.f308320b.hashCode();
    }
}
