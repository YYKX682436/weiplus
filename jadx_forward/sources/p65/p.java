package p65;

/* loaded from: classes12.dex */
public class p implements com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25542x2c26081d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p65.s f433981a;

    public p(p65.s sVar) {
        this.f433981a = sVar;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25542x2c26081d
    /* renamed from: handleFds */
    public void mo95583x3d2142d(java.util.Map map) {
        p65.s sVar = this.f433981a;
        sVar.f433986f.putAll(map);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) sVar.f433986f.get("javaDump");
        java.util.Objects.requireNonNull(parcelFileDescriptor);
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) sVar.f433986f.get("nativeDump");
        java.util.Objects.requireNonNull(parcelFileDescriptor2);
        com.p314xaae8f345.mm.app.s4.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, parcelFileDescriptor, parcelFileDescriptor2);
    }
}
