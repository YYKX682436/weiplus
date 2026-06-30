package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81;

/* renamed from: com.tencent.shadow.core.runtime.container.PluginContainerContentProvider */
/* loaded from: classes16.dex */
public class C25527xea6d453c extends android.content.ContentProvider {

    /* renamed from: hostContentProviderDelegate */
    private com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 f46666x3ca73267;

    public C25527xea6d453c() {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.m94654xbd94db57(new com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.DelegateProviderHolderPrepareListener() { // from class: com.tencent.shadow.core.runtime.container.PluginContainerContentProvider.1
            @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.DelegateProviderHolderPrepareListener
            /* renamed from: onPrepare */
            public void mo94655x3cac0e28() {
                com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47;
                com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25510xed41f020 interfaceC25510xed41f020 = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.f46647x8a5af840;
                if (interfaceC25510xed41f020 != null) {
                    interfaceC25521x12851a47 = interfaceC25510xed41f020.m94651xc33aa531();
                    interfaceC25521x12851a47.m95492x3e5a77bb();
                } else {
                    interfaceC25521x12851a47 = null;
                }
                com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25527xea6d453c.this.f46666x3ca73267 = interfaceC25521x12851a47;
            }
        });
    }

    /* renamed from: checkHostContentProviderDelegate */
    private void m95529x2122503f() {
        if (this.f46666x3ca73267 != null) {
            return;
        }
        throw new java.lang.IllegalArgumentException("hostContentProviderDelegate is null ,请检查ContentProviderDelegateProviderHolder.setDelegateProviderHolderPrepareListener是否调用，或" + getClass().getSimpleName() + " 是否和插件在同一进程");
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(android.net.Uri uri, android.content.ContentValues[] contentValuesArr) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95486xb9736a6b(uri, contentValuesArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95487x2e7a5e(str, str2, bundle);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95488xb06685ab(uri, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95489xfb85f7b0(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95490xb970c2b9(uri, contentValues);
        }
        return null;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            interfaceC25521x12851a47.m95491x50e1c15d(configuration);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            interfaceC25521x12851a47.m95493xb5d8ba56();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            interfaceC25521x12851a47.m95494x29685b02(i17);
        }
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95495xe1e55ae6(uri, str);
        }
        return super.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95497x66f18c8(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95498xce0038c9(uri, contentValues, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        m95529x2122503f();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25521x12851a47 interfaceC25521x12851a47 = this.f46666x3ca73267;
        if (interfaceC25521x12851a47 != null) {
            return interfaceC25521x12851a47.m95496xe1e55ae6(uri, str, cancellationSignal);
        }
        return super.openFile(uri, str);
    }
}
