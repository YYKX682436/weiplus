package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes14.dex */
public class z5 extends wa5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f283142b;

    public z5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f283142b = viewOnClickListenerC21748xb3d38e6b;
    }

    public final void b(java.util.List list, java.util.List list2, java.util.List list3) {
        if (list2 == null || list3 == null || list2.size() != list3.size()) {
            return;
        }
        for (int i17 = 0; i17 < list2.size(); i17++) {
            android.view.View view = (android.view.View) list2.get(i17);
            android.view.View view2 = (android.view.View) list3.get(i17);
            if ((view instanceof android.widget.ImageView) && (view2 instanceof android.widget.ImageView)) {
                android.widget.ImageView imageView = (android.widget.ImageView) view;
                android.widget.ImageView imageView2 = (android.widget.ImageView) view2;
                if (imageView2.getDrawable() != null) {
                    imageView.setImageDrawable(imageView2.getDrawable());
                }
            }
        }
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List list, java.util.Map map) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        if (list != null && map != null) {
            list.clear();
            map.clear();
        }
        java.util.Objects.toString(list);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283142b;
        if (((wa5.j) viewOnClickListenerC21748xb3d38e6b.m80391xac8f1cfd(wa5.j.class)).f525859g) {
            wa5.j jVar = (wa5.j) viewOnClickListenerC21748xb3d38e6b.m80391xac8f1cfd(wa5.j.class);
            jVar.getClass();
            wa5.d dVar = wa5.d.f525848a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = jVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            int intExtra = activity.getIntent().getIntExtra("KEY_EXIT_ACTIVITY", 0);
            wa5.a aVar = null;
            if (intExtra != 0) {
                java.util.Set entrySet = wa5.d.f525849b.entrySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (((android.app.Activity) entry.getKey()).hashCode() == intExtra) {
                        java.lang.Object key = entry.getKey();
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = key instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) key : null;
                        p012xc85e97e9.p093xedfae76a.n b17 = (activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) ? null : mo273xed6858b4.b();
                        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42 = activity.mo273xed6858b4();
                        p012xc85e97e9.p093xedfae76a.n b18 = mo273xed6858b42 != null ? mo273xed6858b42.b() : null;
                        entry.getKey().getClass();
                        java.util.Objects.toString(b17);
                        java.util.Objects.toString(b18);
                        java.lang.ref.WeakReference weakReference = ((wa5.b) entry.getValue()).f525845d;
                        if (weakReference != null) {
                            aVar = (wa5.a) weakReference.get();
                        }
                    }
                }
            }
            if (aVar != null) {
                aVar.a(list, map);
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                if (entry2.getValue() instanceof ya5.a) {
                    ((ya5.a) entry2.getValue()).q();
                }
            }
        }
        java.util.Objects.toString(list);
        super.onMapSharedElements(list, map);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onSharedElementEnd(java.util.List list, java.util.List list2, java.util.List list3) {
        b(list, list2, list3);
        super.onSharedElementEnd(list, list2, list3);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onSharedElementStart(java.util.List list, java.util.List list2, java.util.List list3) {
        b(list, list2, list3);
        super.onSharedElementStart(list, list2, list3);
    }
}
