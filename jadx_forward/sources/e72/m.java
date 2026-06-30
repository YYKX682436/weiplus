package e72;

/* loaded from: classes14.dex */
public class m extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.v f331452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e72.v vVar, long j17, long j18) {
        super(j17, j18);
        this.f331452a = vVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: on count number finished");
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: on ticked");
        e72.v vVar = this.f331452a;
        if (vVar.f331478r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NumberFaceMotion", "hy: isEnd. trigger cancel");
            cancel();
            return;
        }
        if (vVar.f331471k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: suspend.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: mCurrentShowedIndexInItem: %d, mItemDatas[mCurrentGroupDataIndex].length() - 1: %d, mCurrentGroupDataIndex: %d, mItemDatas.length - 1 : %d", java.lang.Integer.valueOf(vVar.f331466f), java.lang.Integer.valueOf(vVar.f331464d[vVar.f331465e].length() - 1), java.lang.Integer.valueOf(vVar.f331465e), java.lang.Integer.valueOf(vVar.f331464d.length - 1));
        if (vVar.f331466f < vVar.f331464d[vVar.f331465e].length() - 1) {
            vVar.f331466f++;
            vVar.f331481u.mo50305x3d8a09a2(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: last number in group");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(vVar.f331483w, 1500L);
        vVar.f331478r = true;
        cancel();
        vVar.f331478r = true;
    }
}
