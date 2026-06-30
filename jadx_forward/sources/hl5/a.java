package hl5;

/* loaded from: classes15.dex */
public class a implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hl5.g f363651a;

    public a(hl5.g gVar) {
        this.f363651a = gVar;
    }

    @Override // nl5.a0
    public void a(android.view.View view, nl5.z zVar, java.lang.String str) {
        hl5.g gVar = this.f363651a;
        gVar.getClass();
        int i17 = zVar.f419931b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = gVar.f363667i;
        switch (i17) {
            case android.R.id.selectAll:
                viewTreeObserverOnPreDrawListenerC22668xe0605023.h0();
                break;
            case android.R.id.cut:
                viewTreeObserverOnPreDrawListenerC22668xe0605023.c0(android.R.id.cut);
                break;
            case android.R.id.copy:
                viewTreeObserverOnPreDrawListenerC22668xe0605023.c0(android.R.id.copy);
                break;
            case android.R.id.paste:
                viewTreeObserverOnPreDrawListenerC22668xe0605023.c0(android.R.id.paste);
                break;
        }
        java.util.Map map = gVar.f363671m;
        int i18 = zVar.f419931b;
        if (((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i18)) && viewTreeObserverOnPreDrawListenerC22668xe0605023.m81618x9236a0b9() != null) {
            try {
                viewTreeObserverOnPreDrawListenerC22668xe0605023.m81618x9236a0b9().onTextContextMenuItem(i18);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("cmEdit.OperateWindow", th6, "adaptText item err %s %s", zVar.f419930a, java.lang.Integer.valueOf(i18));
                fl5.b.a(11);
            }
            viewTreeObserverOnPreDrawListenerC22668xe0605023.t0();
        }
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81673x1a3c5d3a() != null) {
            viewTreeObserverOnPreDrawListenerC22668xe0605023.m81673x1a3c5d3a().a(view, zVar, str);
        }
    }

    @Override // nl5.a0
    public void b(java.util.List list, int i17) {
    }
}
