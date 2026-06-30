package org.p3343x72743996.net;

/* renamed from: org.chromium.net.CronetProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC29502xfcaa84ee {

    /* renamed from: GMS_CORE_CRONET_PROVIDER_CLASS */
    private static final java.lang.String f73782xd670e4fe = "com.google.android.gms.net.GmsCoreCronetProvider";

    /* renamed from: JAVA_CRONET_PROVIDER_CLASS */
    private static final java.lang.String f73783x7a37dbef = "org.chromium.net.impl.JavaCronetProvider";

    /* renamed from: NATIVE_CRONET_PROVIDER_CLASS */
    private static final java.lang.String f73784xc4436824 = "org.chromium.net.impl.NativeCronetProvider";

    /* renamed from: PLAY_SERVICES_CRONET_PROVIDER_CLASS */
    private static final java.lang.String f73785x12ef0b96 = "com.google.android.gms.net.PlayServicesCronetProvider";

    /* renamed from: PROVIDER_NAME_APP_PACKAGED */
    public static final java.lang.String f73786xa22ffc2 = "App-Packaged-Cronet-Provider";

    /* renamed from: PROVIDER_NAME_FALLBACK */
    public static final java.lang.String f73787x279d1048 = "Fallback-Cronet-Provider";

    /* renamed from: RES_KEY_CRONET_IMPL_CLASS */
    private static final java.lang.String f73788xdb85cbbc = "CronetProviderClassName";
    private static final java.lang.String TAG = "CronetProvider";

    /* renamed from: mContext */
    protected final android.content.Context f73789xd6cfe882;

    public AbstractC29502xfcaa84ee(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        this.f73789xd6cfe882 = context;
    }

    /* renamed from: addCronetProviderFromResourceFile */
    private static boolean m153194x2afc4963(android.content.Context context, java.util.Set<org.p3343x72743996.net.AbstractC29502xfcaa84ee> set) {
        java.lang.String string;
        int identifier = context.getResources().getIdentifier(f73788xdb85cbbc, "string", context.getPackageName());
        if (identifier == 0 || (string = context.getResources().getString(identifier)) == null || string.equals(f73785x12ef0b96) || string.equals(f73782xd670e4fe) || string.equals(f73783x7a37dbef) || string.equals(f73784xc4436824)) {
            return false;
        }
        m153195x828f437d(context, string, set, true);
        return true;
    }

    /* renamed from: addCronetProviderImplByClassName */
    private static boolean m153195x828f437d(android.content.Context context, java.lang.String str, java.util.Set<org.p3343x72743996.net.AbstractC29502xfcaa84ee> set, boolean z17) {
        try {
            set.add((org.p3343x72743996.net.AbstractC29502xfcaa84ee) context.getClassLoader().loadClass(str).asSubclass(org.p3343x72743996.net.AbstractC29502xfcaa84ee.class).getConstructor(android.content.Context.class).newInstance(context));
            return true;
        } catch (java.lang.ClassNotFoundException e17) {
            m153197x3f68a867(str, z17, e17);
            return false;
        } catch (java.lang.IllegalAccessException e18) {
            m153197x3f68a867(str, z17, e18);
            return false;
        } catch (java.lang.InstantiationException e19) {
            m153197x3f68a867(str, z17, e19);
            return false;
        } catch (java.lang.NoSuchMethodException e27) {
            m153197x3f68a867(str, z17, e27);
            return false;
        } catch (java.lang.reflect.InvocationTargetException e28) {
            m153197x3f68a867(str, z17, e28);
            return false;
        }
    }

    /* renamed from: getAllProviders */
    public static java.util.List<org.p3343x72743996.net.AbstractC29502xfcaa84ee> m153196x81883677(android.content.Context context) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        m153194x2afc4963(context, linkedHashSet);
        m153195x828f437d(context, f73785x12ef0b96, linkedHashSet, false);
        m153195x828f437d(context, f73782xd670e4fe, linkedHashSet, false);
        m153195x828f437d(context, f73784xc4436824, linkedHashSet, false);
        m153195x828f437d(context, f73783x7a37dbef, linkedHashSet, false);
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(linkedHashSet));
    }

    /* renamed from: logReflectiveOperationException */
    private static void m153197x3f68a867(java.lang.String str, boolean z17, java.lang.Exception exc) {
        if (z17) {
            return;
        }
        android.util.Log.isLoggable(TAG, 3);
    }

    /* renamed from: createBuilder */
    public abstract org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153198x93ab12ff();

    /* renamed from: getName */
    public abstract java.lang.String mo153199xfb82e301();

    /* renamed from: getVersion */
    public abstract java.lang.String mo153200x52c258a2();

    /* renamed from: isEnabled */
    public abstract boolean mo153201x7d80d2b7();

    /* renamed from: toString */
    public java.lang.String m153202x9616526c() {
        return "[class=" + getClass().getName() + ", name=" + mo153199xfb82e301() + ", version=" + mo153200x52c258a2() + ", enabled=" + mo153201x7d80d2b7() + "]";
    }
}
