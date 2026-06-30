package vc1;

/* loaded from: classes13.dex */
public class g implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25938xdc482359 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516499a;

    public g(vc1.p1 p1Var) {
        this.f516499a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25938xdc482359
    /* renamed from: onCancel */
    public void mo98894x3d6f0539() {
        vc1.p1 p1Var = this.f516499a;
        ((java.util.LinkedList) p1Var.S).poll();
        if (p1Var.S.isEmpty()) {
            return;
        }
        ((java.lang.Runnable) ((java.util.LinkedList) p1Var.S).peek()).run();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25938xdc482359
    /* renamed from: onFinish */
    public void mo98895x42fe6352() {
        vc1.p1 p1Var = this.f516499a;
        ((java.util.LinkedList) p1Var.S).poll();
        if (p1Var.S.isEmpty()) {
            return;
        }
        ((java.lang.Runnable) ((java.util.LinkedList) p1Var.S).peek()).run();
    }
}
