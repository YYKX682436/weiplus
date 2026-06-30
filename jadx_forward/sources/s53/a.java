package s53;

/* loaded from: classes5.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16031xcaa50b0e f484700d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16031xcaa50b0e c16031xcaa50b0e) {
        this.f484700d = c16031xcaa50b0e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16031xcaa50b0e c16031xcaa50b0e = this.f484700d;
        java.util.ArrayList arrayList = c16031xcaa50b0e.f223457d;
        if (arrayList.size() >= 2) {
            if (c16031xcaa50b0e.f223458e < arrayList.size() - 1) {
                int i17 = c16031xcaa50b0e.f223458e + 1;
                c16031xcaa50b0e.f223458e = i17;
                str = (java.lang.String) arrayList.get(i17);
            } else {
                c16031xcaa50b0e.f223458e = 0;
                str = (java.lang.String) arrayList.get(0);
            }
            c16031xcaa50b0e.a(c16031xcaa50b0e.f223460g, str);
            c16031xcaa50b0e.f223459f.startAnimation(c16031xcaa50b0e.f223462i);
            c16031xcaa50b0e.f223459f.setVisibility(8);
            c16031xcaa50b0e.f223460g.startAnimation(c16031xcaa50b0e.f223461h);
            c16031xcaa50b0e.f223460g.setVisibility(0);
            android.widget.TextView textView = c16031xcaa50b0e.f223459f;
            c16031xcaa50b0e.f223459f = c16031xcaa50b0e.f223460g;
            c16031xcaa50b0e.f223460g = textView;
        }
        return true;
    }
}
