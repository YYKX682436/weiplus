package com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f;

/* renamed from: com.google.android.gms.dynamic.DeferredLifecycleHelper */
/* loaded from: classes15.dex */
public abstract class AbstractC2026x350819b9<T extends com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef> {
    private com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef zaa;
    private android.os.Bundle zab;
    private java.util.LinkedList zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2032x89dbbe78 zad = new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zaa(this);

    /* renamed from: showGooglePlayUnavailableMessage */
    public static void m18654x429b9321(android.widget.FrameLayout frameLayout) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc m17618x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b();
        android.content.Context context = frameLayout.getContext();
        int mo17630x402556f4 = m17618x9cf0d20b.mo17630x402556f4(context);
        java.lang.String zac = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zac(context, mo17630x402556f4);
        java.lang.String zab = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zab(context, mo17630x402556f4);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        android.widget.TextView textView = new android.widget.TextView(frameLayout.getContext());
        textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        textView.setText(zac);
        linearLayout.addView(textView);
        android.content.Intent mo17626x91cd42da = m17618x9cf0d20b.mo17626x91cd42da(context, mo17630x402556f4, null);
        if (mo17626x91cd42da != null) {
            android.widget.Button button = new android.widget.Button(context);
            button.setId(android.R.id.button1);
            button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            button.setText(zab);
            linearLayout.addView(button);
            button.setOnClickListener(new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zae(context, mo17626x91cd42da));
        }
    }

    private final void zae(int i17) {
        while (!this.zac.isEmpty() && ((com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zah) this.zac.getLast()).zaa() >= i17) {
            this.zac.removeLast();
        }
    }

    private final void zaf(android.os.Bundle bundle, com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zah zahVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            zahVar.zab(interfaceC2030x97ee5eef);
            return;
        }
        if (this.zac == null) {
            this.zac = new java.util.LinkedList();
        }
        this.zac.add(zahVar);
        if (bundle != null) {
            android.os.Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                this.zab = (android.os.Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        m18655x67d326a1(this.zad);
    }

    /* renamed from: createDelegate */
    public abstract void m18655x67d326a1(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2032x89dbbe78<T> interfaceC2032x89dbbe78);

    /* renamed from: getDelegate */
    public T m18656xacb01afb() {
        return (T) this.zaa;
    }

    /* renamed from: handleGooglePlayUnavailable */
    public void m18657x6d3277bb(android.widget.FrameLayout frameLayout) {
        m18654x429b9321(frameLayout);
    }

    /* renamed from: onCreate */
    public void m18658x3e5a77bb(android.os.Bundle bundle) {
        zaf(bundle, new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zac(this, bundle));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: onCreateView */
    public android.view.View m18659x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(layoutInflater.getContext());
        zaf(bundle, new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaa == null) {
            m18657x6d3277bb(frameLayout);
        }
        return frameLayout;
    }

    /* renamed from: onDestroy */
    public void m18660xac79a11b() {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            interfaceC2030x97ee5eef.m18674xac79a11b();
        } else {
            zae(1);
        }
    }

    /* renamed from: onDestroyView */
    public void m18661xa6664a60() {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            interfaceC2030x97ee5eef.m18675xa6664a60();
        } else {
            zae(2);
        }
    }

    /* renamed from: onInflate */
    public void m18662xc3995328(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        zaf(bundle2, new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zab(this, activity, bundle, bundle2));
    }

    /* renamed from: onLowMemory */
    public void m18663xb5d8ba56() {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            interfaceC2030x97ee5eef.m18677xb5d8ba56();
        }
    }

    /* renamed from: onPause */
    public void m18664xb01dfb57() {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            interfaceC2030x97ee5eef.m18678xb01dfb57();
        } else {
            zae(5);
        }
    }

    /* renamed from: onResume */
    public void m18665x57429eec() {
        zaf(null, new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zag(this));
    }

    /* renamed from: onSaveInstanceState */
    public void m18666xa71a2260(android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            interfaceC2030x97ee5eef.m18680xa71a2260(bundle);
            return;
        }
        android.os.Bundle bundle2 = this.zab;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    /* renamed from: onStart */
    public void m18667xb05099c3() {
        zaf(null, new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zaf(this));
    }

    /* renamed from: onStop */
    public void m18668xc39f8281() {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef = this.zaa;
        if (interfaceC2030x97ee5eef != null) {
            interfaceC2030x97ee5eef.m18682xc39f8281();
        } else {
            zae(4);
        }
    }
}
