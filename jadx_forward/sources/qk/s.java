package qk;

/* loaded from: classes10.dex */
public abstract class s extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public qk.y7 f445860d;

    public s(android.content.Context context) {
        super(context);
        this.f445860d = new qk.r(this);
    }

    /* renamed from: getSelectedFeatureListener */
    public qk.y7 m160419xa85e9179() {
        return this.f445860d;
    }

    /* renamed from: setActionBarCallback */
    public abstract void mo160420x1f31d20(qk.i6 i6Var);

    /* renamed from: setActionBarVisible */
    public abstract void mo160421xeaaa6c37(boolean z17);

    /* renamed from: setAutoShowFooterAndBar */
    public abstract void mo160422x2cadd325(boolean z17);

    /* renamed from: setFooterVisible */
    public abstract void mo160423x2f328115(boolean z17);

    /* renamed from: setSelectedFeatureListener */
    public void m160424xbe8e76ed(qk.y7 y7Var) {
        this.f445860d = y7Var;
    }
}
