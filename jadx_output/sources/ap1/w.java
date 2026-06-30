package ap1;

/* loaded from: classes5.dex */
public final class w extends ap1.i0 {

    /* renamed from: h, reason: collision with root package name */
    public long f12751h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f12752i;

    /* renamed from: m, reason: collision with root package name */
    public fo1.h f12753m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f12754n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // ap1.i0
    public void V6() {
        X6();
    }

    @Override // ap1.i0
    public void W6(ap1.a0 item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        ap1.u uVar = new ap1.u(this, item, i17);
        if (this.f12753m != null) {
            uVar.invoke();
        } else {
            pf5.e.launchUI$default(this, null, null, new ap1.s(this, uVar, null), 3, null);
        }
    }

    public final void X6() {
        pf5.e.launch$default(this, null, null, new ap1.m(this, com.tencent.mm.ui.widget.dialog.u3.f(getActivity(), getString(com.tencent.mm.R.string.mwe), true, 3, new ap1.n(this)), null), 3, null);
    }

    @Override // ap1.i0, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f12751h = longExtra;
        if (longExtra < 0) {
            com.tencent.mars.xlog.Log.e(pf5.o.TAG, "Invalid package id = " + this.f12751h);
            j75.f U6 = U6();
            if (U6 != null) {
                U6.B3(new ap1.c(null, 1, null));
                return;
            }
            return;
        }
        com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longExtra);
        if (k17 != null) {
            this.f12752i = k17;
            this.f12754n = pf5.e.launch$default(this, null, null, new ap1.r(this, null), 3, null);
            super.onCreate(bundle);
            return;
        }
        com.tencent.mars.xlog.Log.e(pf5.o.TAG, "Fail to get package by id = " + this.f12751h);
        j75.f U62 = U6();
        if (U62 != null) {
            U62.B3(new ap1.c(null, 1, null));
        }
    }
}
