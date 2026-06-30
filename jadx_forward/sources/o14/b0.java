package o14;

/* loaded from: classes12.dex */
public class b0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f423803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f423804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 f423805c;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f957, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f423805c = activityC17364x9169f957;
        this.f423803a = z17;
        this.f423804b = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = this.f423803a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUplogUI", "Picked hour: %s, %s, %s, %s", valueOf, obj, obj2, java.lang.Boolean.valueOf(z18));
        if (z17) {
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241610t = (java.lang.String) obj;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241611u = (java.lang.String) obj;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957 activityC17364x9169f957 = this.f423805c;
            java.util.ArrayList arrayList = activityC17364x9169f957.f241621q;
            int indexOf = arrayList.indexOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241610t);
            java.util.ArrayList arrayList2 = activityC17364x9169f957.f241622r;
            int indexOf2 = arrayList2.indexOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241611u);
            if (indexOf < 0 || indexOf2 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FixToolsUplogUI", "index of hours < 0! %s, %s", java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(indexOf2));
            }
            if (indexOf > indexOf2) {
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241611u = (java.lang.String) arrayList2.get(indexOf);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241610t = (java.lang.String) arrayList.get(indexOf2);
                }
            }
            activityC17364x9169f957.f241617m.setText(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241610t);
            activityC17364x9169f957.f241618n.setText(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.f241611u);
        }
        this.f423804b.d();
    }
}
