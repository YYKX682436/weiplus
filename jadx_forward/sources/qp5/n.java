package qp5;

/* loaded from: classes9.dex */
public class n extends qp5.o {

    /* renamed from: a, reason: collision with root package name */
    public int f447378a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f447379b;

    public n(int i17, com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2) {
        super(null);
        this.f447379b = viewOnFocusChangeListenerC22907xe18534c2;
        this.f447378a = i17;
        if (i17 == 1) {
            if (viewOnFocusChangeListenerC22907xe18534c2 != null) {
                viewOnFocusChangeListenerC22907xe18534c2.m83205x753bb271(new qp5.m(this));
            }
        } else if (viewOnFocusChangeListenerC22907xe18534c2 != null) {
            viewOnFocusChangeListenerC22907xe18534c2.m83203xc17f97e2(1);
        }
    }

    @Override // qp5.o, rp5.b
    public boolean c(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2) {
        int i17 = this.f447378a;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = viewOnFocusChangeListenerC22907xe18534c2.f295694h;
        if (c28001xdd2bb359 == null) {
            return false;
        }
        return c28001xdd2bb359.m121604xff9f1dc4(i17);
    }

    public void f(int i17) {
        this.f447378a = i17;
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f447379b;
        if (i17 == 1) {
            if (viewOnFocusChangeListenerC22907xe18534c2 != null) {
                viewOnFocusChangeListenerC22907xe18534c2.m83205x753bb271(new qp5.m(this));
            }
        } else if (viewOnFocusChangeListenerC22907xe18534c2 != null) {
            viewOnFocusChangeListenerC22907xe18534c2.m83203xc17f97e2(1);
        }
    }
}
