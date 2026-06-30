package kj;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f389706a = java.util.regex.Pattern.compile("^\"(.*?)\" .*? tid=(\\d+) \\w+$");

    /* renamed from: b, reason: collision with root package name */
    public final java.util.regex.Pattern f389707b = java.util.regex.Pattern.compile("^  - .*?\\(a (.*?)\\) held by thread (\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.StringBuilder f389708c = new java.lang.StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f389709d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f389710e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389711f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f389712g = false;

    /* renamed from: h, reason: collision with root package name */
    public kj.z f389713h = new kj.z();

    public a0(kj.v vVar) {
    }

    public final kj.z a(kj.z zVar) {
        kj.z a17;
        java.util.LinkedList linkedList = this.f389710e;
        linkedList.addLast(zVar);
        zVar.f389814e = 1;
        kj.z zVar2 = (kj.z) this.f389709d.get(java.lang.Integer.valueOf(zVar.f389813d));
        if (zVar2 != null) {
            int i17 = zVar2.f389814e;
            if (i17 == 1) {
                return zVar2;
            }
            if (i17 == 0 && (a17 = a(zVar2)) != null) {
                return a17;
            }
        }
        zVar.f389814e = 2;
        linkedList.removeLast();
        return null;
    }

    public java.util.Map.Entry b() {
        java.util.LinkedList linkedList = this.f389710e;
        if (linkedList.size() == 0) {
            return new kj.y(null, null);
        }
        int[] iArr = new int[linkedList.size()];
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            kj.z zVar = (kj.z) it.next();
            iArr[i17] = zVar.f389810a;
            strArr[i17] = zVar.f389812c;
            i17++;
        }
        return new kj.y(iArr, strArr);
    }

    public boolean c() {
        kj.z a17;
        d("");
        java.util.LinkedList linkedList = this.f389710e;
        linkedList.clear();
        java.util.Iterator it = this.f389709d.entrySet().iterator();
        while (it.hasNext()) {
            kj.z zVar = (kj.z) ((java.util.Map.Entry) it.next()).getValue();
            if (zVar.f389814e == 0 && (a17 = a(zVar)) != null) {
                while (linkedList.size() > 0 && linkedList.getFirst() != a17) {
                    linkedList.removeFirst();
                }
                return true;
            }
        }
        return false;
    }

    public void d(java.lang.String str) {
        boolean isEmpty = str.isEmpty();
        java.lang.StringBuilder sb6 = this.f389708c;
        if (isEmpty) {
            this.f389712g = false;
            if (sb6.length() <= 0 || this.f389713h.f389813d < 0) {
                return;
            }
            java.lang.String sb7 = sb6.toString();
            kj.z zVar = this.f389713h;
            int i17 = zVar.f389810a;
            if (i17 == 1) {
                this.f389711f = sb7;
            }
            zVar.f389811b = sb7;
            this.f389709d.put(java.lang.Integer.valueOf(i17), this.f389713h);
            this.f389713h = new kj.z();
            return;
        }
        if (this.f389712g) {
            java.util.regex.Matcher matcher = this.f389707b.matcher(str);
            if (matcher.find()) {
                try {
                    this.f389713h.f389812c = matcher.group(1);
                    kj.z zVar2 = this.f389713h;
                    java.lang.String group = matcher.group(2);
                    java.util.Objects.requireNonNull(group);
                    zVar2.f389813d = java.lang.Integer.parseInt(group);
                } catch (java.lang.Exception e17) {
                    oj.j.b("SignalAnrTracer", e17.toString(), new java.lang.Object[0]);
                }
            }
            sb6.append(str);
            sb6.append('\n');
            return;
        }
        java.util.regex.Matcher matcher2 = this.f389706a.matcher(str);
        if (matcher2.find()) {
            this.f389712g = true;
            sb6.setLength(0);
            sb6.append(str);
            sb6.append('\n');
            try {
                kj.z zVar3 = this.f389713h;
                java.lang.String group2 = matcher2.group(2);
                java.util.Objects.requireNonNull(group2);
                zVar3.f389810a = java.lang.Integer.parseInt(group2);
            } catch (java.lang.Exception e18) {
                oj.j.b("SignalAnrTracer", e18.toString(), new java.lang.Object[0]);
            }
        }
    }
}
