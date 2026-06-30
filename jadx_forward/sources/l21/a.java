package l21;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f396735a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f396736b;

    public a(long j17) {
        this.f396736b = 0L;
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncEngine", "init  key  enckey " + valueOf + "  hashcode " + hashCode());
        this.f396736b = com.p314xaae8f345.mm.p1006xc5476f33.p1784xb95d3637.C16115x2e306be6.m65153x34264a(valueOf);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncEngine", "mNativePtr " + this.f396736b + " " + hashCode());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EncEngine", "exception " + e17.getMessage());
        }
    }
}
