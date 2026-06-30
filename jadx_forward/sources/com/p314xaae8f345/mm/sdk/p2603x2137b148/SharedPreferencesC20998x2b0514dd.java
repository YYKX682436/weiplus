package com.p314xaae8f345.mm.sdk.p2603x2137b148;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences */
/* loaded from: classes8.dex */
public class SharedPreferencesC20998x2b0514dd extends android.content.ContentProvider implements android.content.SharedPreferences {

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f273947o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile android.net.Uri f273948p;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273951f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f273952g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f273953h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.BroadcastReceiver f273954i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.UriMatcher f273955m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f273956n;

    public SharedPreferencesC20998x2b0514dd() {
    }

    public static android.content.SharedPreferences b(android.content.Context context, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(new com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd(context, str, i17), M);
        return M;
    }

    public final void a(android.content.Context context) {
        java.lang.String str;
        android.content.pm.PackageInfo packageInfo;
        android.content.pm.ProviderInfo[] providerInfoArr;
        if (f273948p == null) {
            android.net.Uri uri = f273948p;
            synchronized (this) {
                str = null;
                if (uri == null) {
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
                        int length = providerInfoArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                break;
                            }
                            android.content.pm.ProviderInfo providerInfo = providerInfoArr[i17];
                            if (providerInfo.name.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.class.getName())) {
                                str = providerInfo.authority;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (str == null) {
                        str = context.getPackageName() + ".sdk.platformtools.MultiProcessSharedPreferences";
                    }
                    uri = android.net.Uri.parse("content://" + str);
                }
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("'AUTHORITY' initialize failed.");
                }
            }
            f273947o = str;
            f273948p = uri;
        }
    }

    public final java.lang.Object c(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.Object obj2 = null;
        if (this.f273952g) {
            return null;
        }
        a(this.f273949d);
        android.net.Uri withAppendedPath = android.net.Uri.withAppendedPath(android.net.Uri.withAppendedPath(f273948p, this.f273950e), str);
        java.lang.String[] strArr = new java.lang.String[3];
        strArr[0] = java.lang.String.valueOf(this.f273951f);
        strArr[1] = str2;
        strArr[2] = obj == null ? null : java.lang.String.valueOf(obj);
        android.database.Cursor query = this.f273949d.getContentResolver().query(withAppendedPath, null, null, strArr, null);
        if (query != null) {
            try {
                android.os.Bundle extras = query.getExtras();
                if (extras != null) {
                    obj2 = extras.get("value");
                    extras.clear();
                }
            } catch (java.lang.Exception unused) {
            }
            query.close();
        }
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        java.lang.Boolean bool = (java.lang.Boolean) c("contains", str, null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final java.lang.String d(java.lang.String str) {
        return java.lang.String.format("%1$s_%2$s", com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.class.getName(), str);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external delete");
    }

    public final void e(java.lang.String str, java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(d(str));
        intent.setPackage(getContext().getPackageName());
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
        intent.putExtra("value", arrayList);
        getContext().sendBroadcast(intent);
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.r4(this);
    }

    @Override // android.content.SharedPreferences
    public java.util.Map getAll() {
        return (java.util.Map) c("getAll", null, null);
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        java.lang.Boolean bool = (java.lang.Boolean) c("getBoolean", str, java.lang.Boolean.valueOf(z17));
        return bool != null ? bool.booleanValue() : z17;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        java.lang.Float f18 = (java.lang.Float) c("getFloat", str, java.lang.Float.valueOf(f17));
        return f18 != null ? f18.floatValue() : f17;
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        java.lang.Integer num = (java.lang.Integer) c("getInt", str, java.lang.Integer.valueOf(i17));
        return num != null ? num.intValue() : i17;
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        java.lang.Long l17 = (java.lang.Long) c("getLong", str, java.lang.Long.valueOf(j17));
        return l17 != null ? l17.longValue() : j17;
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (java.lang.String) c("getString", str, str2);
        return str3 != null ? str3 : str2;
    }

    @Override // android.content.SharedPreferences
    public java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        synchronized (this) {
            java.util.Set set2 = (java.util.Set) c("getString", str, set);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.UnsupportedOperationException("No external call");
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("No external insert");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a(getContext());
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        this.f273955m = uriMatcher;
        uriMatcher.addURI(f273947o, "*/getAll", 1);
        this.f273955m.addURI(f273947o, "*/getString", 2);
        this.f273955m.addURI(f273947o, "*/getInt", 3);
        this.f273955m.addURI(f273947o, "*/getLong", 4);
        this.f273955m.addURI(f273947o, "*/getFloat", 5);
        this.f273955m.addURI(f273947o, "*/getBoolean", 6);
        this.f273955m.addURI(f273947o, "*/contains", 7);
        this.f273955m.addURI(f273947o, "*/apply", 8);
        this.f273955m.addURI(f273947o, "*/commit", 9);
        this.f273955m.addURI(f273947o, "*/registerOnSharedPreferenceChangeListener", 10);
        this.f273955m.addURI(f273947o, "*/unregisterOnSharedPreferenceChangeListener", 11);
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        java.util.Map map = this.f273956n;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
        super.onLowMemory();
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        java.util.Map map = this.f273956n;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
        super.onTrimMemory(i17);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        java.lang.String str3 = uri.getPathSegments().get(0);
        int parseInt = java.lang.Integer.parseInt(strArr2[0]);
        java.lang.String str4 = strArr2[1];
        java.lang.String str5 = strArr2[2];
        android.os.Bundle bundle = new android.os.Bundle();
        switch (this.f273955m.match(uri)) {
            case 1:
                bundle.putSerializable("value", (java.util.HashMap) getContext().getSharedPreferences(str3, parseInt).getAll());
                break;
            case 2:
                bundle.putString("value", getContext().getSharedPreferences(str3, parseInt).getString(str4, str5));
                break;
            case 3:
                bundle.putInt("value", getContext().getSharedPreferences(str3, parseInt).getInt(str4, java.lang.Integer.parseInt(str5)));
                break;
            case 4:
                bundle.putLong("value", getContext().getSharedPreferences(str3, parseInt).getLong(str4, java.lang.Long.parseLong(str5)));
                break;
            case 5:
                bundle.putFloat("value", getContext().getSharedPreferences(str3, parseInt).getFloat(str4, java.lang.Float.parseFloat(str5)));
                break;
            case 6:
                bundle.putBoolean("value", getContext().getSharedPreferences(str3, parseInt).getBoolean(str4, java.lang.Boolean.parseBoolean(str5)));
                break;
            case 7:
                bundle.putBoolean("value", getContext().getSharedPreferences(str3, parseInt).contains(str4));
                break;
            case 8:
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("This is Unknown Uri：" + uri);
            case 10:
                if (this.f273956n == null) {
                    this.f273956n = new java.util.HashMap();
                }
                java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) this.f273956n).get(str3);
                int intValue = (num == null ? 0 : num.intValue()) + 1;
                ((java.util.HashMap) this.f273956n).put(str3, java.lang.Integer.valueOf(intValue));
                java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) this.f273956n).get(str3);
                bundle.putBoolean("value", intValue == (num2 == null ? 0 : num2.intValue()));
                break;
            case 11:
                if (this.f273956n == null) {
                    this.f273956n = new java.util.HashMap();
                }
                java.lang.Integer num3 = (java.lang.Integer) ((java.util.HashMap) this.f273956n).get(str3);
                int intValue2 = (num3 == null ? 0 : num3.intValue()) - 1;
                if (intValue2 > 0) {
                    ((java.util.HashMap) this.f273956n).put(str3, java.lang.Integer.valueOf(intValue2));
                    java.lang.Integer num4 = (java.lang.Integer) ((java.util.HashMap) this.f273956n).get(str3);
                    bundle.putBoolean("value", intValue2 == (num4 == null ? 0 : num4.intValue()));
                    break;
                } else {
                    ((java.util.HashMap) this.f273956n).remove(str3);
                    bundle.putBoolean("value", !((java.util.HashMap) this.f273956n).containsKey(str3));
                    break;
                }
        }
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.q4(bundle);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            if (this.f273953h == null) {
                this.f273953h = new java.util.ArrayList();
            }
            java.lang.Boolean bool = (java.lang.Boolean) c("registerOnSharedPreferenceChangeListener", null, java.lang.Boolean.FALSE);
            if (bool != null && bool.booleanValue()) {
                this.f273953h.add(new java.lang.ref.SoftReference(onSharedPreferenceChangeListener));
                if (this.f273954i == null) {
                    this.f273954i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.p4(this);
                    if (fp.h.a(33)) {
                        this.f273949d.registerReceiver(this.f273954i, new android.content.IntentFilter(d(this.f273950e)));
                    } else {
                        this.f273949d.registerReceiver(this.f273954i, new android.content.IntentFilter(d(this.f273950e)), 4);
                    }
                }
            }
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        android.content.BroadcastReceiver broadcastReceiver;
        synchronized (this) {
            c("unregisterOnSharedPreferenceChangeListener", null, java.lang.Boolean.FALSE);
            if (this.f273953h != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.ref.SoftReference softReference : this.f273953h) {
                    android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) softReference.get();
                    if (onSharedPreferenceChangeListener2 != null && onSharedPreferenceChangeListener2.equals(onSharedPreferenceChangeListener)) {
                        arrayList.add(softReference);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f273953h.remove((java.lang.ref.SoftReference) it.next());
                }
                if (this.f273953h.isEmpty() && (broadcastReceiver = this.f273954i) != null) {
                    this.f273949d.unregisterReceiver(broadcastReceiver);
                    this.f273954i = null;
                    this.f273953h = null;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        java.lang.String str2 = uri.getPathSegments().get(0);
        android.content.SharedPreferences sharedPreferences = getContext().getSharedPreferences(str2, java.lang.Integer.parseInt(strArr[0]));
        int match = this.f273955m.match(uri);
        if (match != 8 && match != 9) {
            throw new java.lang.IllegalArgumentException("This is Unknown Uri：" + uri);
        }
        java.util.Map map = this.f273956n;
        boolean z17 = (map == null || ((java.util.HashMap) map).get(str2) == null || ((java.lang.Integer) ((java.util.HashMap) this.f273956n).get(str2)).intValue() <= 0) ? false : true;
        java.util.Map<java.lang.String, ?> hashMap = new java.util.HashMap<>();
        if (z17) {
            arrayList = new java.util.ArrayList();
            hashMap = sharedPreferences.getAll();
        } else {
            arrayList = null;
        }
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        if (java.lang.Boolean.parseBoolean(strArr[1])) {
            if (z17 && hashMap != null && !hashMap.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getKey());
                }
            }
            edit.clear();
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((value instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.r4) || value == null) {
                edit.remove(key);
                if (z17 && hashMap != null && hashMap.containsKey(key)) {
                    arrayList.add(key);
                }
            } else if (z17 && hashMap != null && (!hashMap.containsKey(key) || (hashMap.containsKey(key) && !value.equals(hashMap.get(key))))) {
                arrayList.add(key);
            }
            if (value instanceof java.lang.String) {
                edit.putString(key, (java.lang.String) value);
            } else if (value instanceof java.util.Set) {
                try {
                } catch (java.lang.IllegalAccessException e17) {
                    throw new java.lang.RuntimeException(e17);
                } catch (java.lang.IllegalArgumentException e18) {
                    throw new java.lang.RuntimeException(e18);
                } catch (java.lang.NoSuchMethodException e19) {
                    throw new java.lang.RuntimeException(e19);
                } catch (java.lang.reflect.InvocationTargetException e27) {
                    throw new java.lang.RuntimeException(e27);
                }
            } else if (value instanceof java.lang.Integer) {
                edit.putInt(key, ((java.lang.Integer) value).intValue());
            } else if (value instanceof java.lang.Long) {
                edit.putLong(key, ((java.lang.Long) value).longValue());
            } else if (value instanceof java.lang.Float) {
                edit.putFloat(key, ((java.lang.Float) value).floatValue());
            } else if (value instanceof java.lang.Boolean) {
                edit.putBoolean(key, ((java.lang.Boolean) value).booleanValue());
            }
        }
        if (!z17 || !arrayList.isEmpty()) {
            if (match != 8) {
                if (match == 9 && edit.commit()) {
                    e(str2, arrayList);
                }
                contentValues.clear();
                return i17;
            }
            try {
                edit.getClass().getDeclaredMethod("apply", new java.lang.Class[0]).invoke(edit, new java.lang.Object[0]);
                e(str2, arrayList);
            } catch (java.lang.IllegalAccessException e28) {
                throw new java.lang.RuntimeException(e28);
            } catch (java.lang.IllegalArgumentException e29) {
                throw new java.lang.RuntimeException(e29);
            } catch (java.lang.NoSuchMethodException e37) {
                throw new java.lang.RuntimeException(e37);
            } catch (java.lang.reflect.InvocationTargetException e38) {
                throw new java.lang.RuntimeException(e38);
            }
        }
        i17 = 1;
        contentValues.clear();
        return i17;
    }

    public SharedPreferencesC20998x2b0514dd(android.content.Context context, java.lang.String str, int i17) {
        this.f273949d = context;
        this.f273950e = str;
        this.f273951f = i17;
        this.f273952g = context.getPackageManager().isSafeMode();
    }
}
