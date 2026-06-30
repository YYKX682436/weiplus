package wb;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb.g f525870d;

    public f(wb.g gVar, byte b17) {
        this.f525870d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb.i iVar;
        int i17;
        wb.g gVar = this.f525870d;
        if (gVar.f525871a.m21460x59478a9() != 0) {
            iVar = gVar.f525872b;
            i17 = -102;
        } else {
            com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2880x73ecff87 c2880x73ecff87 = gVar.f525871a;
            byte[] bArr = gVar.f525873c;
            if (c2880x73ecff87.m21465x3aa2088e(bArr, bArr.length) != 0) {
                iVar = gVar.f525872b;
                i17 = -103;
            } else {
                if (gVar.f525871a.end() == 0) {
                    wb.a aVar = new wb.a();
                    if (gVar.f525871a.m21462x2d64eb13(aVar) != 0) {
                        gVar.f525872b.a(-105);
                    }
                    android.os.Handler handler = gVar.f525872b.f525879b;
                    handler.sendMessage(handler.obtainMessage(200, aVar));
                    return;
                }
                iVar = gVar.f525872b;
                i17 = -104;
            }
        }
        iVar.a(i17);
    }
}
