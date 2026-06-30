package qd;

/* loaded from: classes7.dex */
public abstract class a implements o91.a {
    @Override // o91.a
    public void b(java.lang.String str, java.util.Map map, o91.c cVar) {
        d(str, cVar);
    }

    public abstract void d(java.lang.String str, o91.c cVar);

    /* renamed from: equals */
    public boolean m159831xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof o91.a)) {
            return false;
        }
        if (key().equalsIgnoreCase(((o91.a) obj).key())) {
            return true;
        }
        return super.equals(obj);
    }
}
