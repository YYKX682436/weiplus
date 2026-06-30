package ms4;

/* loaded from: classes8.dex */
public class v implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js4.o f412660a;

    public v(ms4.z zVar, js4.o oVar) {
        this.f412660a = oVar;
    }

    @Override // wd0.p1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinManagerImplement", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
        js4.o oVar = this.f412660a;
        if (oVar != null) {
            oVar.a(3, -3, "授权微信豆失败");
        }
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinManagerImplement", "changeSwitchWechatForStatus2CommonTips onPositionBtn.");
        js4.o oVar = this.f412660a;
        if (oVar != null) {
            oVar.mo14245xe05b4124(null);
        }
    }
}
