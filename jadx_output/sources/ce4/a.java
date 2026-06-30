package ce4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final ce4.b f40790a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f40791b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40792c;

    public a(ce4.b pcContext) {
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f40790a = pcContext;
        this.f40791b = d();
    }

    public final ce4.a a(java.lang.Class clazz) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("component", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        ce4.a k17 = ((com.tencent.mm.plugin.sns.ui.n1) this.f40790a).k(clazz);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("component", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return k17;
    }

    public java.util.ArrayList b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return arrayList;
    }

    public final com.tencent.mm.ui.MMActivity c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        com.tencent.mm.plugin.sns.ui.n1 n1Var = (com.tencent.mm.plugin.sns.ui.n1) this.f40790a;
        n1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.tencent.mm.ui.MMActivity mMActivity = n1Var.f169957c;
        kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return mMActivity;
    }

    public abstract java.lang.String d();

    public final void e(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e(this.f40791b, hashCode() + " >> " + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }

    public final void f(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(this.f40791b, hashCode() + " >> " + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }

    public final void g(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logW", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.w(this.f40791b, hashCode() + " >> " + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logW", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }

    public boolean h(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        if (this.f40792c) {
            g("isCreated");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
            return false;
        }
        this.f40792c = true;
        for (ce4.a aVar : b()) {
            if (!aVar.f40792c) {
                aVar.h(bundle);
            }
        }
        f("onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return true;
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        this.f40792c = false;
        f("onDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }
}
