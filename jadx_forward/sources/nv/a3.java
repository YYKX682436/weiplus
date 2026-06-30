package nv;

/* loaded from: classes4.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f421832f;

    public a3(nv.b3 b3Var, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.f421830d = str;
        this.f421831e = str2;
        this.f421832f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore.MsgSynchronize", "start MsgSynchronizeServer");
        if (vi3.k.f519134f == null) {
            vi3.k.f519134f = new vi3.k();
        }
        vi3.k.f519134f.d(this.f421830d, this.f421831e, this.f421832f, "");
    }
}
