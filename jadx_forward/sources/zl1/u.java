package zl1;

/* loaded from: classes7.dex */
public class u implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.v f555158d;

    public u(zl1.v vVar) {
        this.f555158d = vVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "Base64IconLoader";
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.v vVar = this.f555158d;
        try {
            android.graphics.Bitmap c17 = zl1.v.c(vVar, vVar.f555159a);
            zl1.z zVar = vVar.f555164f;
            if (zVar != null) {
                zVar.a(c17, vVar);
            }
        } catch (java.lang.Exception unused) {
            vVar.f555161c.a("Failed to load icon via base64 icon", vVar);
        }
    }
}
