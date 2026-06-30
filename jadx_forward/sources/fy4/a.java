package fy4;

/* loaded from: classes8.dex */
public final class a extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fy4.e f348786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.inputmethod.InputConnection inputConnection, fy4.e eVar) {
        super(inputConnection, false);
        this.f348786a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) {
        fy4.e eVar = this.f348786a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewInputConnectionHelper", "performPrivateCommand action = %s", action);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewInputConnectionHelper", "canRevivedIMECommand， recieveIMECommand = " + eVar.f348793e);
            if (!eVar.f348793e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewInputConnectionHelper", "performPrivateCommand -> not support");
                return false;
            }
            return ((i05.n) ((p94.t0) i95.n0.c(p94.t0.class))).Bi(eVar.f348792d.f265348f, eVar, action, data);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebviewInputConnectionHelper", e17, null, new java.lang.Object[0]);
            return false;
        }
    }
}
