package pm0;

/* loaded from: classes10.dex */
public abstract class v {

    /* renamed from: a */
    public static final java.util.regex.Pattern f438335a = java.util.regex.Pattern.compile("%([0-9]+\\$|<?)([^a-zA-z%]*)([[a-zA-Z%]&&[^tT]]|[tT][a-zA-Z])");

    /* renamed from: b */
    public static final java.lang.reflect.InvocationHandler f438336b = pm0.e.f438299a;

    public static final boolean A(long j17, long j18) {
        return (j17 & j18) > 0;
    }

    public static final void B(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = view.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(view);
        }
    }

    public static final void C(java.lang.Runnable task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(task);
    }

    public static final byte[] D(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null) {
            return null;
        }
        try {
            return fVar.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("safeToByteArray", "", e17);
            return null;
        }
    }

    public static final java.lang.Object E(java.lang.Boolean bool, java.lang.Object obj) {
        if (bool == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            obj = null;
        }
        return obj;
    }

    public static final boolean F(java.util.List list) {
        boolean isEmpty;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        synchronized (list) {
            isEmpty = list.isEmpty();
        }
        return isEmpty;
    }

    public static final boolean G(java.util.List list, yz5.l predicate) {
        boolean B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        synchronized (list) {
            B = kz5.h0.B(list, predicate);
        }
        return B;
    }

    public static final void H(java.util.Map map, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        synchronized (map) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((java.lang.Boolean) predicate.mo146xb9724478(((java.util.Map.Entry) it.next()).getValue())).booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public static final boolean I(java.util.Collection collection, yz5.l f17) {
        boolean c07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "f");
        synchronized (collection) {
            c07 = c0(collection, f17);
        }
        return c07;
    }

    public static final km5.d J(km5.d dVar, yz5.l func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        km5.d n17 = dVar.m(pm0.c0.f438298d).n(new pm0.q(func));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "next(...)");
        return n17;
    }

    public static final void K(java.lang.String str, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (str == null || str.length() == 0) {
            try {
                java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                if (stackTrace != null && stackTrace.length >= 4) {
                    java.lang.String className = stackTrace[3].getClassName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "getClassName(...)");
                    java.lang.String substring = className.substring(15);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    str = (substring + ':' + stackTrace[3].getMethodName()) + '[' + stackTrace[3].getLineNumber() + ']';
                }
            } catch (java.lang.Throwable unused) {
            }
            str = "";
        }
        L(str, true, block);
    }

    public static final void L(java.lang.String taskName, boolean z17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ((ku5.t0) ku5.t0.f394148d).g(new pm0.r(taskName, block, z17));
    }

    public static /* synthetic */ void M(java.lang.String str, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        L(str, z17, aVar);
    }

    public static final wu5.c N(java.lang.String tag, boolean z17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ku5.u0 u0Var = ku5.t0.f394148d;
        pm0.s sVar = new pm0.s(tag, block, z17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c l17 = t0Var.l(sVar, 0L, tag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "execute(...)");
        return l17;
    }

    public static final void O(java.lang.String tag, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        N(tag, true, block);
    }

    public static final void P(java.lang.String tag, boolean z17, yz5.a block, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ((ku5.t0) ku5.t0.f394148d).l(new pm0.t(tag, block, z17), j17, tag);
    }

    public static /* synthetic */ void Q(java.lang.String str, boolean z17, yz5.a aVar, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            j17 = 0;
        }
        P(str, z17, aVar, j17);
    }

    public static final android.graphics.Bitmap R(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "toBitmap8888", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/kt/CommonKt", "toBitmap8888", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        createBitmap.setPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public static final int S(int i17) {
        return i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
    }

    public static final km5.d T(km5.d dVar, yz5.l func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        km5.d h17 = dVar.h(new pm0.u(func));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "$ui(...)");
        return h17;
    }

    public static final void U(long j17, java.lang.Runnable task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(task, j17);
    }

    public static final void V(long j17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new pm0.p(block), j17);
    }

    public static final void W(java.lang.Runnable task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            task.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(task);
        }
    }

    public static final void X(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            block.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pm0.p(block));
        }
    }

    public static final java.lang.Object Y(byte[] bytes, android.os.Parcelable.Creator creator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creator, "creator");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        obtain.unmarshall(bytes, 0, bytes.length);
        obtain.setDataPosition(0);
        java.lang.Object createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public static final long Z(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        try {
            return pm0.d.a(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Common.Kt", th6, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    public static final void a(android.view.View view, yz5.a call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        pm0.g gVar = new pm0.g(call, view);
        view.addOnLayoutChangeListener(gVar);
        android.view.View.OnAttachStateChangeListener hVar = new pm0.h(gVar, view);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f564081hg);
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = tag instanceof android.view.View.OnAttachStateChangeListener ? (android.view.View.OnAttachStateChangeListener) tag : null;
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        view.addOnAttachStateChangeListener(hVar);
        view.setTag(com.p314xaae8f345.mm.R.id.f564081hg, hVar);
    }

    public static final java.lang.Object a0(java.util.HashSet hashSet, yz5.l func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashSet, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) func.mo146xb9724478(next)).booleanValue()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static final void b(android.view.View view, yz5.a call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        view.addOnLayoutChangeListener(new pm0.j(view, call));
    }

    public static final boolean b0(java.util.ArrayList arrayList, yz5.l func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.lang.Boolean) func.mo146xb9724478(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        boolean z17 = !arrayList2.isEmpty();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        return z17;
    }

    public static final void c(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setShadowLayer(i65.a.b(textView.getContext(), 3), 0.0f, i65.a.b(textView.getContext(), 1), Integer.MIN_VALUE);
    }

    public static final boolean c0(java.util.Collection collection, yz5.l f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "f");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (((java.lang.Boolean) f17.mo146xb9724478(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            collection.remove(it.next());
        }
        return true;
    }

    public static final void d(android.content.Intent intent, android.content.Intent intent2, java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, intent2 != null ? java.lang.Boolean.valueOf(intent2.getBooleanExtra(key, z17)) : null);
    }

    public static final boolean d0(java.util.LinkedList linkedList, yz5.l func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.Object obj : linkedList) {
            if (((java.lang.Boolean) func.mo146xb9724478(obj)).booleanValue()) {
                linkedList2.add(obj);
            }
        }
        boolean z17 = !linkedList2.isEmpty();
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            linkedList.remove(it.next());
        }
        return z17;
    }

    public static void e(android.content.Intent intent, android.os.Bundle bundle, java.lang.String key, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean(key, z17)) : null);
    }

    public static final java.lang.String e0(java.lang.String str, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (i17 < 0 || i18 > str.length() || i17 > i18) {
            return str;
        }
        java.lang.String substring = str.substring(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public static void f(android.content.Intent intent, android.content.Intent intent2, java.lang.String key, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, intent2 != null ? java.lang.Float.valueOf(intent2.getFloatExtra(key, f17)) : null);
    }

    public static final void g(android.content.Intent intent, android.content.Intent intent2, java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, intent2 != null ? java.lang.Integer.valueOf(intent2.getIntExtra(key, i17)) : null);
    }

    public static void h(android.content.Intent intent, android.os.Bundle bundle, java.lang.String key, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, bundle != null ? java.lang.Integer.valueOf(bundle.getInt(key, i17)) : null);
    }

    public static void i(android.content.Intent intent, android.os.Bundle bundle, java.lang.String key, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, bundle != null ? java.lang.Long.valueOf(bundle.getLong(key, j17)) : null);
    }

    public static final void j(android.content.Intent intent, android.os.Bundle bundle, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, bundle != null ? bundle.getStringArrayList(key) : null);
    }

    public static final void k(android.content.Intent intent, android.content.Intent intent2, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, intent2 != null ? intent2.getStringExtra(key) : null);
    }

    public static final void l(android.content.Intent intent, android.os.Bundle bundle, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        intent.putExtra(key, bundle != null ? bundle.getString(key) : null);
    }

    public static final android.os.HandlerThread m(java.lang.String name, boolean z17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(name, 5);
        a17.start();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper()).mo50293x3498a0(new pm0.k(block, z17, a17));
        return a17;
    }

    public static final android.graphics.Bitmap n(android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.graphics.Bitmap.Config config = drawable.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
        arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/kt/CommonKt", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final android.graphics.Bitmap o(android.graphics.drawable.Drawable drawable, int i17, int i18, android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/kt/CommonKt", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, i17, i18);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final android.util.LongSparseArray p(android.util.LongSparseArray longSparseArray, yz5.p func) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longSparseArray, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        android.util.LongSparseArray longSparseArray2 = new android.util.LongSparseArray();
        int size = longSparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            long keyAt = longSparseArray.keyAt(i17);
            java.lang.Object valueAt = longSparseArray.valueAt(i17);
            if (((java.lang.Boolean) func.mo149xb9724478(java.lang.Long.valueOf(keyAt), valueAt)).booleanValue()) {
                longSparseArray2.put(keyAt, valueAt);
            }
        }
        return longSparseArray2;
    }

    public static final android.app.Activity q(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public static final android.graphics.Rect r(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static final int[] s(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    public static final int[] t(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final java.lang.String u(long j17) {
        java.lang.String str;
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            while (j18 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toUnsignedString(...)");
        return str;
    }

    public static final byte[] v(android.os.Parcelable parcelable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcelable, "parcelable");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(marshall);
        return marshall;
    }

    public static final void w(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            K(null, block);
        } else {
            block.mo152xb9724478();
        }
    }

    public static final void x(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        X(new pm0.m(g0Var, observer));
    }

    public static final void y(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        X(new pm0.o(g0Var, owner, observer));
    }

    public static final boolean z(int i17, int i18) {
        return (i17 & i18) > 0;
    }
}
