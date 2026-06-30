package ux1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f513373d;

    /* renamed from: e, reason: collision with root package name */
    public final long f513374e;

    /* renamed from: f, reason: collision with root package name */
    public final int f513375f;

    public a(java.lang.Class cls, int i17) {
        this.f513374e = 0L;
        this.f513375f = 0;
        this.f513373d = cls;
        this.f513375f = i17;
        this.f513374e = java.lang.System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append("#exec_bad#");
        java.lang.Class cls = this.f513373d;
        sb6.append(cls.getName());
        sb6.append("#");
        sb6.append(cls.getGenericSuperclass());
        sb6.append("#");
        sb6.append(this.f513375f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BadBinder", sb6.toString());
    }
}
