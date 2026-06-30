package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.SplitPairFilter */
/* loaded from: classes11.dex */
public final class C1219x5e21258c {
    private final android.content.ComponentName primaryActivityName;
    private final java.lang.String secondaryActivityIntentAction;
    private final android.content.ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1219x5e21258c(android.content.ComponentName r12, android.content.ComponentName r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    /* renamed from: equals */
    public boolean m8481xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c c1219x5e21258c = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.primaryActivityName, c1219x5e21258c.primaryActivityName) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.secondaryActivityName, c1219x5e21258c.secondaryActivityName) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.secondaryActivityIntentAction, c1219x5e21258c.secondaryActivityIntentAction);
    }

    public final android.content.ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final java.lang.String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final android.content.ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    /* renamed from: hashCode */
    public int m8485x8cdac1b() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        java.lang.String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: matchesActivityIntentPair */
    public final boolean m8486x57b66698(android.app.Activity primaryActivity, android.content.Intent secondaryActivityIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(primaryActivity, "primaryActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secondaryActivityIntent, "secondaryActivityIntent");
        android.content.ComponentName componentName = primaryActivity.getComponentName();
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1216x9c90dabf c1216x9c90dabf = p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1216x9c90dabf.f3825x4fbc8495;
        if (!c1216x9c90dabf.m8456xc740c255(componentName, this.primaryActivityName) || !c1216x9c90dabf.m8456xc740c255(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        java.lang.String str = this.secondaryActivityIntentAction;
        return str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, secondaryActivityIntent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (m8486x57b66698(r6, r7) != false) goto L15;
     */
    /* renamed from: matchesActivityPair */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m8487x292535c(android.app.Activity r6, android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            androidx.window.embedding.MatcherUtils r0 = p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1216x9c90dabf.f3825x4fbc8495
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.primaryActivityName
            boolean r1 = r0.m8456xc740c255(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r4 = r5.secondaryActivityName
            boolean r0 = r0.m8456xc740c255(r1, r4)
            if (r0 == 0) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = r3
        L29:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L43
            if (r0 == 0) goto L41
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "secondaryActivity.intent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r0)
            boolean r6 = r5.m8486x57b66698(r6, r7)
            if (r6 == 0) goto L41
            goto L42
        L41:
            r2 = r3
        L42:
            r0 = r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c.m8487x292535c(android.app.Activity, android.app.Activity):boolean");
    }

    /* renamed from: toString */
    public java.lang.String m8488x9616526c() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((java.lang.Object) this.secondaryActivityIntentAction) + '}';
    }
}
