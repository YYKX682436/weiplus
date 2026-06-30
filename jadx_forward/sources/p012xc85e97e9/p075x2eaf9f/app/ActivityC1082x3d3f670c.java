package p012xc85e97e9.p075x2eaf9f.app;

/* renamed from: androidx.core.app.ComponentActivity */
/* loaded from: classes13.dex */
public class ActivityC1082x3d3f670c extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements p012xc85e97e9.p093xedfae76a.y, n3.s {

    /* renamed from: mExtraDataMap */
    private x.n f2862x392f902f = new x.n();

    /* renamed from: mLifecycleRegistry */
    private p012xc85e97e9.p093xedfae76a.b0 f2863xf011f8da = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView = getWindow().getDecorView();
        if (decorView == null || !n3.t.a(decorView, keyEvent)) {
            return n3.t.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView = getWindow().getDecorView();
        if (decorView == null || !n3.t.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @java.lang.Deprecated
    /* renamed from: getExtraData */
    public <T extends z2.r> T m7207xf04ce124(java.lang.Class<T> cls) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(this.f2862x392f902f.m174751x4aabfc28(cls, null));
        return null;
    }

    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f2863xf011f8da;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p093xedfae76a.t0.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        this.f2863xf011f8da.g(p012xc85e97e9.p093xedfae76a.n.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @java.lang.Deprecated
    /* renamed from: putExtraData */
    public void m7208x83d6dd8b(z2.r rVar) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L33;
     */
    /* renamed from: shouldDumpInternalState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m7209xed764cd(java.lang.String[] r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L6c
            int r2 = r5.length
            if (r2 <= 0) goto L6c
            r5 = r5[r0]
            r5.getClass()
            int r2 = r5.hashCode()
            r3 = -1
            switch(r2) {
                case -645125871: goto L41;
                case 100470631: goto L36;
                case 472614934: goto L2b;
                case 1159329357: goto L20;
                case 1455016274: goto L15;
                default: goto L14;
            }
        L14:
            goto L4b
        L15:
            java.lang.String r2 = "--autofill"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L1e
            goto L4b
        L1e:
            r3 = 4
            goto L4b
        L20:
            java.lang.String r2 = "--contentcapture"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L29
            goto L4b
        L29:
            r3 = 3
            goto L4b
        L2b:
            java.lang.String r2 = "--list-dumpables"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L34
            goto L4b
        L34:
            r3 = 2
            goto L4b
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L3f
            goto L4b
        L3f:
            r3 = r1
            goto L4b
        L41:
            java.lang.String r2 = "--translation"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L4a
            goto L4b
        L4a:
            r3 = r0
        L4b:
            switch(r3) {
                case 0: goto L65;
                case 1: goto L5e;
                case 2: goto L5e;
                case 3: goto L57;
                case 4: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L6c
        L4f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r5 < r2) goto L6c
        L55:
            r0 = r1
            goto L6c
        L57:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r5 < r2) goto L6c
            goto L55
        L5e:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r5 < r2) goto L6c
            goto L55
        L65:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r5 < r2) goto L6c
            goto L55
        L6c:
            r5 = r0 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c.m7209xed764cd(java.lang.String[]):boolean");
    }

    @Override // n3.s
    /* renamed from: superDispatchKeyEvent */
    public boolean mo2572xc58cf3b0(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public p012xc85e97e9.p093xedfae76a.o y6() {
        return mo273xed6858b4();
    }
}
