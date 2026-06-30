package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class c1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f f260879a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f viewOnClickListenerC19077xceb7df6f) {
        this.f260879a = viewOnClickListenerC19077xceb7df6f;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f viewOnClickListenerC19077xceb7df6f = this.f260879a;
        if (z17) {
            viewOnClickListenerC19077xceb7df6f.f260766h.setEnabled(true);
            viewOnClickListenerC19077xceb7df6f.f260766h.setClickable(true);
        } else {
            viewOnClickListenerC19077xceb7df6f.f260766h.setEnabled(false);
            viewOnClickListenerC19077xceb7df6f.f260766h.setClickable(false);
        }
    }
}
