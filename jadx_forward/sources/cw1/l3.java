package cw1;

/* loaded from: classes12.dex */
public class l3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.j3 f304635a;

    public l3(cw1.j3 j3Var) {
        this.f304635a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        cw1.j3 j3Var = this.f304635a;
        if (j3Var.f304564n) {
            return;
        }
        j3Var.notifyDataSetChanged();
    }
}
