package vw3;

/* loaded from: classes.dex */
public final class o7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f522591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f522592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI f522593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(android.widget.EditText editText, yz5.l lVar, com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI videoSendDebugConfigUI) {
        super(0);
        this.f522591d = editText;
        this.f522592e = lVar;
        this.f522593f = videoSendDebugConfigUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var = jz5.f0.f384359a;
        android.text.Editable text = this.f522591d.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        java.lang.String obj = r26.n0.u0(text).toString();
        yz5.l lVar = this.f522592e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Integer h17 = r26.h0.h(obj);
            boolean z17 = true;
            if ((h17 != null ? h17.intValue() : 0) != 1) {
                z17 = false;
            }
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f522593f.d, m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
