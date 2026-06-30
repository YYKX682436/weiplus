package tl1;

/* loaded from: classes15.dex */
public class e0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f f501736a;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f c12792x5854885f) {
        this.f501736a = c12792x5854885f;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f c12792x5854885f = this.f501736a;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f.a(c12792x5854885f, message.arg1, message.arg2, message.obj);
        } else {
            if (i17 != 3) {
                return;
            }
            c12792x5854885f.requestLayout();
        }
    }
}
