package qp5;

/* loaded from: classes9.dex */
public class b extends qp5.o {
    public b() {
        super(null);
    }

    @Override // qp5.o, rp5.b
    public boolean a(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() > 5) {
            return false;
        }
        viewOnFocusChangeListenerC22907xe18534c2.m83212xf579a34a(0);
        viewOnFocusChangeListenerC22907xe18534c2.m83187x7417561(str);
        viewOnFocusChangeListenerC22907xe18534c2.m83207x214db04e(24 - str.length());
        viewOnFocusChangeListenerC22907xe18534c2.m83198x7e4f2d39(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(viewOnFocusChangeListenerC22907xe18534c2.m83179x59574842())});
        return true;
    }

    @Override // qp5.o, rp5.b
    public boolean c(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = viewOnFocusChangeListenerC22907xe18534c2.f295694h;
        if (c28001xdd2bb359 == null) {
            return false;
        }
        return c28001xdd2bb359.m121605x7cde7910();
    }

    @Override // qp5.o, rp5.b
    public boolean d(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() > 5) {
            return false;
        }
        viewOnFocusChangeListenerC22907xe18534c2.m83212xf579a34a(0);
        viewOnFocusChangeListenerC22907xe18534c2.m83189xe38fb33e(str);
        viewOnFocusChangeListenerC22907xe18534c2.m83207x214db04e(24 - str.length());
        viewOnFocusChangeListenerC22907xe18534c2.m83198x7e4f2d39(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(viewOnFocusChangeListenerC22907xe18534c2.m83179x59574842())});
        return true;
    }

    @Override // qp5.o, rp5.b
    public java.lang.String e(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2, java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.replaceAll(" ", "");
    }
}
