package zc;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f552877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552878e;

    public f(android.content.Intent intent, com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238) {
        this.f552877d = intent;
        this.f552878e = c3646xcf902238;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = this.f552877d;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("animated", true) : true;
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552878e;
        c3646xcf902238.f127507p.m89765x10864c08(new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24239x994a7856(c3646xcf902238.f127498d, booleanExtra), new zc.e(c3646xcf902238, intent));
    }
}
