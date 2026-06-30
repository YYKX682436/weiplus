package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295745d;

    public p0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f295745d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.view.View m78513xc2a54588;
        android.view.View m78513xc2a545882;
        android.view.View findFocus;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f295745d;
        m78513xc2a54588 = abstractActivityC22902xe37969e.m78513xc2a54588();
        if (m78513xc2a54588 == null) {
            findFocus = null;
        } else {
            m78513xc2a545882 = abstractActivityC22902xe37969e.m78513xc2a54588();
            findFocus = m78513xc2a545882.findFocus();
        }
        if (findFocus != null) {
            boolean z17 = findFocus instanceof android.widget.EditText;
        }
    }
}
