package sn1;

/* loaded from: classes12.dex */
public class c0 implements ln1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sn1.f0 f491530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f491531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn1.e0 f491532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f491534e;

    public c0(sn1.f0 f0Var, java.util.LinkedList linkedList, sn1.e0 e0Var, java.lang.String str, byte[] bArr) {
        this.f491530a = f0Var;
        this.f491531b = linkedList;
        this.f491532c = e0Var;
        this.f491533d = str;
        this.f491534e = bArr;
    }

    @Override // ln1.z
    public void a(java.lang.Object obj) {
        ((ln1.e0) this.f491530a).a((sn1.a0) obj);
        int i17 = sn1.a0.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupDataPushScene", "out backupList:%d", java.lang.Integer.valueOf(this.f491531b.size()));
    }

    @Override // ln1.z
    public java.lang.Object run() {
        return new sn1.a0(this.f491532c, this.f491533d, this.f491531b, this.f491534e, null);
    }
}
