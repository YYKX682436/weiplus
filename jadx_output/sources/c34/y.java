package c34;

/* loaded from: classes11.dex */
public class y implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c34.z f38246d;

    public y(c34.z zVar) {
        this.f38246d = zVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 54158) {
            return false;
        }
        c34.z zVar = this.f38246d;
        zVar.getClass();
        c34.x xVar = zVar.f38247d;
        if (xVar == null) {
            return false;
        }
        ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar).a7(null, 5L);
        return false;
    }
}
