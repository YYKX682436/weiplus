package p61;

/* loaded from: classes.dex */
public class c2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p61.d2 f433760a;

    public c2(p61.d2 d2Var) {
        this.f433760a = d2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            p61.d2 d2Var = this.f433760a;
            java.lang.String className = d2Var.f433766d.mo55332x76847179().getComponentName().getClassName();
            if (className.startsWith("com.tencent.mm.plugin.account")) {
                className = className.substring("com.tencent.mm.plugin.account".length());
            }
            o05.l lVar = (o05.l) i95.n0.c(o05.l.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = d2Var.f433766d.mo55332x76847179();
            ps4.g gVar = (ps4.g) lVar;
            gVar.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", className);
            bundle.putString("realname_verify_process_jump_plugin", "account");
            gVar.Bi(mo55332x76847179, bundle);
        }
    }
}
